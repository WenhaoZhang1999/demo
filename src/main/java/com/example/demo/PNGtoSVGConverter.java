package com.example.demo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.imageio.ImageIO;

public class PNGtoSVGConverter {

    public static void main(String[] args) throws IOException {
        Rain rain = new Rain();
        Person person = new Person();
        person.setAge(9999);
        rain.setPerson(person);
        rain.getPerson().setAge(10);
        System.out.println(rain.getPerson().getAge());
    }
}
