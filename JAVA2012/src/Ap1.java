//猜生日
/*今年的植树节（2012年3月12日），小明和他的叔叔还有小伙伴们一起去植树。休息的时候，小明的同学问他叔叔多大年纪，他叔叔说：“我说个题目，看你们谁先猜出来！”

“把我出生的年月日连起来拼成一个8位数（月、日不足两位前补0）正好可以被今天的年、月、日整除！”
他想了想，又补充到：“再给个提示，我是6月出生的。”*/
public class Ap1{

	public static void main(String[] args) {
// TODO Auto-generated method stub
int year,day,birthday;
for(year=1900;;year++)
for(day=1;day<=30;day++)//6月份最多30号
{
birthday=year*10000+600+day;
if(birthday%2012==0&&birthday%3==0&&birthday%12==0)
{
System.out.print(birthday);
break;
   }
  }
 }
}

