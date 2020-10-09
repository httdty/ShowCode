package happy;

import java.applet.AudioClip;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

// ����ģ�����
public class Piano extends JFrame implements KeyListener{
	
	/*
	 * G�������
	 */
	// ��������
	AudioClip do_low = new Music("music/do_low.wav").getAudioClip();
	AudioClip re_low = new Music("music/re_low.wav").getAudioClip();
	AudioClip mi_low = new Music("music/mi_low.wav").getAudioClip();
	AudioClip fa_low = new Music("music/fa_low.wav").getAudioClip();
	AudioClip so_low = new Music("music/so_low.wav").getAudioClip();
	AudioClip la_low = new Music("music/la_low.wav").getAudioClip();
	AudioClip si_low = new Music("music/si_low.wav").getAudioClip();
	
	// ��������
	AudioClip do_mid = new Music("music/do.wav").getAudioClip();
	AudioClip re_mid = new Music("music/re.wav").getAudioClip();
	AudioClip mi_mid = new Music("music/mi.wav").getAudioClip();
	AudioClip fa_mid = new Music("music/fa.wav").getAudioClip();
	AudioClip so_mid = new Music("music/so.wav").getAudioClip();
	AudioClip la_mid = new Music("music/la.wav").getAudioClip();
	AudioClip si_mid = new Music("music/si.wav").getAudioClip();
	
	// ���ӵĳ���
	int beat_1 = 1000; // 1��1��
	int beat_1p5 = beat_1 + beat_1 / 2;
	int beat_3d4 = beat_1 * 3 / 4;
	int beat_1d3 = beat_1 / 3;
	int beat_1d2 = beat_1 / 2;
	int beat_1d4 = beat_1 / 4;
	
	// ��thread.sleep()��ʾ������ĳ���
	Thread thread = new Thread();
	
	// map���ж�ÿ�������Ƿ���
	Map<Character, Boolean> isPlay = new HashMap<Character, Boolean>(); // ����->�Ƿ����ڲ���
	
	// 71����
	private int anniversary = 71;
	
	// ���캯������ʼ������
	public Piano() {
		// TODO Auto-generated constructor stub
		
		
		this.setBounds(anniversary, anniversary, anniversary * 10, anniversary * 10);// ���ô��ڴ�С
		this.add(new JLabel(new ImageIcon("picture/china.gif"))); //���ͼ��
		
		this.addKeyListener(this); // ��Ӽ�����
		this.setVisible(true); // ��ʾ
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �رղ���

		// ��ʼ��map
		isPlay.put('q', false);
		isPlay.put('w', false);
		isPlay.put('e', false);
		isPlay.put('r', false);
		isPlay.put('t', false);
		isPlay.put('y', false);
		isPlay.put('u', false);
		for(char i = '1'; i <= '7'; i++){
			isPlay.put(i, false);
		}
		
	}
	
	// ����
	private void play(char c){
		switch (c) {
		case 'q':
			do_low.play();
			break;
		case 'w':
			re_low.play();
			break;
		case 'e':
			mi_low.play();
			break;
		case 'r':
			fa_low.play();
			break;
		case 't':
			so_low.play();
			break;
		case 'y':
			la_low.play();
			break;
		case 'u':
			si_low.play();
			break;
		case '1':
			do_mid.play();
			break;
		case '2':
			re_mid.play();
			break;
		case '3':
			mi_mid.play();
			break;
		case '4':
			fa_mid.play();
			break;
		case '5':
			so_mid.play();
			break;
		case '6':
			la_mid.play();
			break;
		case '7':
			si_mid.play();
			break;
		default:
			break;
		}
	}
	
	// ��ͣ
	private void stop(char c){
		switch (c) {
		case 'q':
			do_low.stop();
			break;
		case 'w':
			re_low.stop();
			break;
		case 'e':
			mi_low.stop();
			break;
		case 'r':
			fa_low.stop();
			break;
		case 't':
			so_low.stop();
			break;
		case 'y':
			la_low.stop();
			break;
		case 'u':
			si_low.stop();
			break;
		case '1':
			do_mid.stop();
			break;
		case '2':
			re_mid.stop();
			break;
		case '3':
			mi_mid.stop();
			break;
		case '4':
			fa_mid.stop();
			break;
		case '5':
			so_mid.stop();
			break;
		case '6':
			la_mid.stop();
			break;
		case '7':
			si_mid.stop();
			break;

		default:
			break;
		}
	}
	
	// ����ǰ��
	public void pre() throws InterruptedException{
		do_mid.play();
		thread.sleep(beat_3d4);
		do_mid.stop();
		mi_mid.play();
		thread.sleep(beat_1d4);
		mi_mid.stop();
		so_mid.play();
		thread.sleep(beat_1d2);
		so_mid.stop();
		so_mid.play();
		thread.sleep(beat_1d2);
		so_mid.stop();
		
		la_mid.play();
		thread.sleep(beat_1);
		la_mid.stop();
		so_mid.play();
		thread.sleep(beat_1);
		la_mid.stop();
		
		mi_mid.play();
		thread.sleep(beat_3d4);
		mi_mid.stop();
		do_mid.play();
		thread.sleep(beat_1d4);
		do_mid.stop();
		so_mid.play();
		thread.sleep(beat_1d3);
		so_mid.stop();
		so_mid.play();
		thread.sleep(beat_1d3);
		so_mid.stop();
		so_mid.play();
		thread.sleep(beat_1d3);
		so_mid.stop();
		
		mi_mid.play();
		thread.sleep(beat_1);
		mi_mid.stop();
		do_mid.play();
		thread.sleep(beat_1);
		do_mid.stop();
		
		so_low.play();
		thread.sleep(beat_1d3);
		so_low.stop();
		so_low.play();
		thread.sleep(beat_1d3);
		so_low.stop();
		so_low.play();
		thread.sleep(beat_1d3);
		so_low.stop();
		so_low.play();
		thread.sleep(beat_1d3);
		so_low.stop();
		so_low.play();
		thread.sleep(beat_1d3);
		so_low.stop();
		so_low.play();
		thread.sleep(beat_1d3);
//			so_low.stop();
		
		do_mid.play();
		thread.sleep(beat_1);
		thread.sleep(beat_1d2);// 0
//		so_low.play();
//		thread.sleep(beat_1d2);
//		
//		do_mid.stop();
//		do_mid.play();
//		thread.sleep(beat_1p5);
//		do_mid.play();
//		thread.sleep(beat_1d2);
	}

	
	// ���̰���ʱ
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
//		System.out.println("keyTyped: " + e.getKeyChar());
		char c = e.getKeyChar();
		if(isPlay.get(c) != null && isPlay.get(c) == false){ // ������ʱ���룬ʵ�ֳ���ֻ����һ��
			isPlay.put(c, true);
			play(c);
		}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
//		System.out.println("keyPressed: " + e.getKeyChar());
		
	}
	
	// �����ͷ�ʱ
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
//		System.out.println("keyReleased: " + e.getKeyChar());
		char c = e.getKeyChar();
		stop(c);
		isPlay.put(c, false); // �ɿ�ʱ�����ڲ���
	}
	
}
