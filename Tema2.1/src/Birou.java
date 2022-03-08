
public class Birou {

	int latime;
	int lungime;
	int inaltime;
	
	Sertar s1 = new Sertar(10,38,15);
	Sertar s2 = new Sertar(11,36,17);
	
	@Override
	public String toString() {
		return "Birou [latime=" + latime + ", lungime=" + lungime + ", inaltime=" + inaltime + ", s1=" + s1 + ", s2="
				+ s2 + "]";
	}



	public Birou(int latime, int lungime, int inaltime) {
		
		this.latime = latime;
		this.lungime = lungime;
		this.inaltime = inaltime;
		
	}
	
	//int latime1;
	//int lungime1;
	//int inaltime1;
	
	//int latime2;
	//int lungime2;
	//int inaltime2;
	
	//@Override
	//public String toString() {
	//	return " Sertar1 [" + latime1 + "-" + lungime1 + "-" + inaltime1 + "]" + " Sertar2 [" + latime2 + "-" + lungime2 + "-" + inaltime2 + "]" +" latime/lungime/inaltime [" + latime + "-" + lungime + "-" + inaltime + "]";
	//}
	//public Birou(int latime, int lungime, int inaltime,int latime1, int lungime1, int inaltime1,int latime2, int lungime2, int inaltime2) {
	//	this.latime1 = latime1;
//
	//	this.lungime1 = lungime1;

		//this.inaltime1 = inaltime1;
	//
		///this.latime = latime;
//
	//	this.lungime = lungime;
	//
		//this.inaltime = inaltime;
	//
		//this.latime2 = latime2;
	//
		//this.lungime2 = lungime2;
	//
		//this.inaltime2 = inaltime2;
	//}
	}

	
