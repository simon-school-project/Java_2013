//������
/*�����ֲ���ڣ�2012��3��12�գ���С�����������廹��С�����һ��ȥֲ������Ϣ��ʱ��С����ͬѧ������������ͣ�������˵������˵����Ŀ��������˭�Ȳ³�������

�����ҳ�����������������ƴ��һ��8λ�����¡��ղ�����λǰ��0�����ÿ��Ա�������ꡢ�¡�����������
�������룬�ֲ��䵽�����ٸ�����ʾ������6�³����ġ���*/
public class Ap1{

	public static void main(String[] args) {
// TODO Auto-generated method stub
int year,day,birthday;
for(year=1900;;year++)
for(day=1;day<=30;day++)//6�·����30��
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

