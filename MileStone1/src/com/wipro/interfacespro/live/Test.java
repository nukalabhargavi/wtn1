package com.wipro.interfacespro.live;
import com.wipro.interfacespro.music.*;
import com.wipro.interfacespro.music.string.Veena;
import com.wipro.interfacespro.music.wind.Saxophone;
public class Test {
public static void main(String args[])
{
	Veena v=new Veena();
	v.play();
	Saxophone s=new Saxophone();
	s.play();
	Playable p1=new Veena();
	p1.play();
	Playable p2=new Saxophone();
	p2.play();
}

}