package prob2;

public class SmartPhone extends MusicPhone {

	@Override
	public void execute(String function) {
		if(function.equals("앱")) {
			System.out.println("앱 실행");
		}else if(function.equals("음악")) {
			this.playMusic();
		}else {
			super.execute(function);
		}
	}

	@Override
	protected void playMusic() {
		System.out.println("다운로드해서 음악 재생");
	}
	
}
