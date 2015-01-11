package com.dancarlyon.togglemod.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static void init(File configFile)
    {
        //Let's create one if it doesn't exist
        Configuration configuration = new Configuration(configFile);
        boolean configValue = false;

        try
        {
            //Load File
            configuration.load();

            //Read File
            configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "This is en example").getBoolean();

        }
        catch (Exception e)
        {
            //Log any exceptions
        }
        finally
        {
            //Save
            configuration.save();
        }
    }
}
