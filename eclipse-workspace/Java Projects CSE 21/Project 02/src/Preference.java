
public class Preference {
	private int quietTime, music, reading, chatting;
	
	Preference(int theQT, int theMusic, int theReading, int theChatting){
		quietTime = theQT;
		music = theMusic;
		reading = theReading;
		chatting = theChatting;
	}
	
	public int getQT() {
		return quietTime;
	}
	public int getReading() {
		return reading;
	}
	public int getMusic() {
		return music;
	}
	
	public int getChatting() {
		return chatting;
	}
	
	public int compare(Preference pref) {
		return (Math.abs(quietTime - pref.quietTime) + Math.abs(music - pref.music) + Math. abs(reading - pref.reading) + Math.abs(chatting - pref.chatting));
		
	}
}
