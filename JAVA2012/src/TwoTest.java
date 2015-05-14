
public class TwoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year,day,birthday;
		for(year=1900;;year++)
		for(day=1;day<=30;day++)//6月份最多30号
		{
		birthday=year*10000+600+day;
		if(birthday%2012==0&&birthday%3==0&&birthday%12==0){
		System.out.print(birthday);
		break;
		}
		}


	}

}
