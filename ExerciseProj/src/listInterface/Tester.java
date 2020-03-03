package listInterface;

import java.util.ArrayList;
import java.util.List;

public class Tester {
	public static void main(String[] args) {
		List<Participant> participants = new ArrayList<Participant>();
		Participant p1 = new Participant();
		p1.setPartcipantName("Hazel");
		p1.setParticipantScore(29.75f);
		p1.setParticipantTalent("Singing");
		Participant p2 = new Participant();
		p2.setPartcipantName("Hazel");
		p2.setParticipantScore(29.75f);
		p2.setParticipantTalent("Singing");
		Participant p3 = new Participant();
		p3.setPartcipantName("Hazel");
		p3.setParticipantScore(29.75f);
		p3.setParticipantTalent("Singing");
		Participant p4 = new Participant();
		p4.setPartcipantName("Hazel");
		p4.setParticipantScore(29.75f);
		p4.setParticipantTalent("Singing");
		participants.add(p1);
		participants.add(p2);
		participants.add(p3);
		participants.add(p4);
		float max = 0;
		String name = null;
		for(Participant p:participants) {
			if(p.getParticipantScore()>max){
				max = p.getParticipantScore();
				name = p.getPartcipantName();
				}
		}
		System.out.println("PArticipant with highest score is:");
		System.out.println(name+" "+max);
		
		
		
	}
	


}
