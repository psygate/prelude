package com.psygate.minecraft.spigot.sovereignty.prelude.configuration;

import com.psygate.minecraft.spigot.sovereignty.prelude.Prelude;
import com.psygate.minecraft.spigot.sovereignty.prelude.configuration.parsing.BooleanEvaluable;
import com.psygate.minecraft.spigot.sovereignty.prelude.configuration.parsing.util.GrammarParser;
import com.psygate.minecraft.spigot.sovereignty.prelude.data.PlayerDataCollection;
import org.bukkit.configuration.file.FileConfiguration;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by psygate on 26.04.2016.
 */
public class Configuration {
    private BooleanEvaluable dedicationFunction;
    private String undedicatedMessage;
    private String dedicatedMessage;

    private Configuration() {

    }

    public Configuration(FileConfiguration conf) {
        File actualConf = new File(Prelude.getInstance().getDataFolder(), "prelude.conf");
        if (!actualConf.exists()) {
            try (InputStream in = Configuration.class.getResourceAsStream("/prelude.conf");
                 FileOutputStream out = new FileOutputStream(actualConf)) {
                int read;

                while ((read = in.read()) != -1) {
                    out.write(read);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        parseConfiguration(new File(Prelude.getInstance().getDataFolder(), "prelude.conf"));

        undedicatedMessage = conf.getString("message.undedicated_message");
        dedicatedMessage = conf.getString("message.dedicated_message");
    }

    private void parseConfiguration(File file) {
        GrammarParser parser = new GrammarParser(file);
        dedicationFunction = parser.parse();
    }


    public static void main(String[] args) throws IOException {
        Configuration conf = new Configuration();
        conf.parseConfiguration(new File("src/main/resources/prelude.conf"));
    }

    public boolean checkDedication(PlayerDataCollection col) {
        return dedicationFunction.eval(col);
    }

    public String getUndedicatedMessage() {
        return undedicatedMessage;
    }

    public String getDedicatedMessage() {
        return dedicatedMessage;
    }

    public List<String> buildHelpText(PlayerDataCollection playerDataCollection) {
        return dedicationFunction.getHints(playerDataCollection);
    }
}
