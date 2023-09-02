package customException;

class ItemStockOverFlowException extends RuntimeException {

	public ItemStockOverFlowException(String msg) {
		super(msg);
	}
}

class ItemStockUnderFlowException extends RuntimeException {

	public ItemStockUnderFlowException(String msg) {
		super(msg);
	}
}

class Store {

	int noOfItemsAvailable;
	int maximumLevel;
	int minimumLevel;

	public Store(int noOfItemsAvailable, int maximumLevel, int minimumLevel) {

		this.noOfItemsAvailable = noOfItemsAvailable;
		this.maximumLevel = maximumLevel;
		this.minimumLevel = minimumLevel;
	}

	public void addItem() {

		if (noOfItemsAvailable >= maximumLevel) {

			throw new ItemStockOverFlowException("Maximum stock limit reached");

		} else {
			noOfItemsAvailable++;
		}
	}

	public void removeItem() {

		if (noOfItemsAvailable <= minimumLevel) {
			throw new ItemStockUnderFlowException("Minimun stock limit reached");

		} else {
			noOfItemsAvailable--;
		}
	}

	public void checkStore() {

		System.out.println(noOfItemsAvailable);
	}

}

public class CustomExcepEg {

	public static void main(String[] args) {

		Store s = new Store(10, 11, 10);

		try {
			s.addItem();
			s.addItem();
			s.addItem();
		} catch (ItemStockOverFlowException e) {
			System.out.println(e.getMessage());
		}

		s.checkStore();

		try {
			s.removeItem();
			s.removeItem();
			s.removeItem();
		} catch (ItemStockUnderFlowException e) {
			System.out.println(e.getMessage());
		}

		s.checkStore();

	}

}
