package com.wipro.interfacespro.music.string;
import com.wipro.interfacespro.music.Playable;
public class Veena implements Playable{
@Override
public void play()
{
	System.out.println("Veena is an music instrument");
}
}