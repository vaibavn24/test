package exercises.exercises4;

import edu.princeton.cs.introcs.StdAudio;

public class Sound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double hz = 440.0;
		double seconds = 1.5;
		
		int SAMPLE_RATE = 44100;
		int N = (int) (seconds * SAMPLE_RATE);
		double[] a = new double[N+1];
		for (int i = 0; i<=N; i++) {
			
			a[i] = Math.sin(2*Math.PI * i * hz/SAMPLE_RATE);
			System.out.println(a[i]);
		}
		
		StdAudio.play(a);
		
		
		
		
		
	}

}
