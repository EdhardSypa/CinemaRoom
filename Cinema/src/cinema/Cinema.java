package cinema;

public class Cinema {

	public static void main(String[] args) {
		TheCinemaRoom room = new TheCinemaRoom(InputData.inputRows(), InputData.inputSeats());
        while (true) {
            switch (InputData.inputMenuOption()) {
                case 1:
                    room.printRoom();
                    break;
                case 2:
                    while (!room.buyTicket(InputData.inputRow(), InputData.inputSeat())) ;
                    break;
                case 3:
                    room.caclAndPrintStatistics();
                    break;
                case 0:
                    return;
            }
        }
	}

}
