package Project;

import java.util.ArrayList;

public class MembershipMgr {

	ArrayList<Membership> mlist = new ArrayList<>();
	public MembershipMgr() {}
	public void init() {
		mlist.add(new Membership("GOLD OLIVE", 1000000,1.5));
		mlist.add(new Membership("BLACK OLIVE", 700000,1.25));
		mlist.add(new Membership("GREEN OLIVE", 400000,1.0));
		mlist.add(new Membership("PINK OLIVE", 100000,0.75));
		mlist.add(new Membership("BABY OLIVE", 0,0.5));
	}
	
	public void printData() {
		for(int i=0; i<mlist.size(); i++) {
			Membership ms = mlist.get(i);
			System.out.println(ms);
		}
	}
	public Membership  FindMembership(int totalCost) {
		if(totalCost>=1000000) return mlist.get(0);
		else if(totalCost>=700000 && totalCost<1000000) return mlist.get(1);
		else if(totalCost>=400000 && totalCost<700000) return mlist.get(2);
		else if(totalCost>=100000 && totalCost<400000) return mlist.get(3);
		else if(totalCost>=0 && totalCost<100000) return mlist.get(4);
		return null;
	}
	
	
	
}
