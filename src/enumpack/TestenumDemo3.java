package enumpack;

enum TrainStatus{
	CANCELLED(108), RUNNING(109), DIVERTED(110);
	int value;
	private TrainStatus(int value) {
		this.value=value;
	}
}
public class TestenumDemo3 {

	public static void main(String[] args) {
		TrainStatus[] tArray = TrainStatus.values();
		for(TrainStatus status:tArray) {
			System.out.println(status+" "+status.value);
		}
	}
}