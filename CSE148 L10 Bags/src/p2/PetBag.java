package p2;

public class PetBag {
	private Pet[] petArray;
	private int nItems;
	
	public PetBag(int maxSize) {
		petArray = new Pet[maxSize];
	}
	
	public void insert(Pet pet) {
		petArray[nItems++] = pet;
	}
	
	public void display() {
		for(int i = 0; i < nItems; i++) {
			System.out.println(petArray[i]);
		}
		System.out.println();
	}
	
	public Pet findDogByName(String name) {
		for(int i = 0; i < nItems; i++) {
			if(petArray[i] instanceof Dog && petArray[i].getName().equals(name)) {
				return petArray[i];
			}
		}
		return null;
	}
	
	public Pet deleteCatByWeight(double weight) {
		int i;
		for(i = 0; i< nItems; i++) {
			if(petArray[i] instanceof Cat && ((Cat)petArray[i]).getWeight() == weight) {
				break;
			}
		}
		
		if(i == nItems) {
			return null;
		} else {
			Cat temp = (Cat)petArray[i];
			for(int j = i; j < nItems-1; j++) {
				petArray[j] = petArray[j+1];
			}
			nItems--;
			return temp;
		}
	}
}
