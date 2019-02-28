import java.util.ArrayList;

public class InterestFactor {
	private Slide a;
	private Slide b;
	private int commonTags;

	private int AnotBtags;
	private int BnotAtags;

	public InterestFactor(Slide a, Slide b) {
		this.a = a;
		this.b = b;
		calcInterest();
	}

	private void calcInterest() {
		ArrayList<String> tagsA = a.getTags();
		ArrayList<String> tagsB = b.getTags();
		ArrayList<String> commonTagsArr = new ArrayList<String>(tagsA);
		commonTagsArr.retainAll(tagsB);
		commonTags = commonTagsArr.size();
		AnotBtags = retainUniqueNumber(tagsA, tagsB);
		BnotAtags = retainUniqueNumber(tagsB, tagsA);

	}

	public Integer retainUniqueNumber(ArrayList<String> listA, ArrayList<String> listB) {

		ArrayList<String> newList = new ArrayList<String>();

		// Traverse through the first list
		for (String element : listA) {

			if (!listB.contains(element)) {

				newList.add(element);
			}
		}

		// return the new list
		return newList.size();
	}

	public Integer getInterestFactor() {
		ArrayList<Integer> valueFactors = new ArrayList<Integer>();
		valueFactors.add(commonTags);
		valueFactors.add(AnotBtags);
		valueFactors.add(BnotAtags);
		valueFactors.sort(null);
		return valueFactors.get(0);
	}

	public Slide getA() {
		return a;
	}

	public Slide getB() {
		return b;
	}

	public int getCommonTags() {
		return commonTags;
	}

	public int getAnotBtags() {
		return AnotBtags;
	}

	public int getBnotAtags() {
		return BnotAtags;
	}
}
