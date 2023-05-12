package me.tenteur.hardenedsurvival;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;



public class UtilityFunction extends JavaPlugin {


    public static void alertServer(String message) {
        Bukkit.broadcastMessage(message);
    }
    public static void printConsole(String message){
        Bukkit.getConsoleSender().sendMessage(message);
    }
    public static double pickRandomNumber(int min, int max, int numbersAfterComma) {
        if (max > min) {
            double randomNumber = Math.random() * ((max - 1) - min + 1) + min;
            if (numbersAfterComma >= 1) {
                double pow = Math.pow(10, numbersAfterComma);
                randomNumber = Math.round(randomNumber * pow) / pow;
            } else {
                randomNumber = Math.round(randomNumber);
            }
            return randomNumber;
        }
        return 0;
    }

}