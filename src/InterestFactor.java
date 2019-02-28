import java.util.ArrayList;

public class InterestFactor {
	private Slide a;
	private Slide b;
	private int commonTags;


	private int AnotBtags;
	private int BnotAtags;

	public InterestFactor(Slide a, Slide b) {
		this.a=a;
		this.b=b;
		calcInterest();
	}

	private void calcInterest() {
		ArrayList<String> tagsA= a.getTags();
		ArrayList<String> tagsB= b.getTags();
		ArrayList<String> commonTagsArr = new ArrayList<String>(tagsA);
		commonTagsArr.retainAll(tagsB);
		commonTags=commonTagsArr.size();
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
