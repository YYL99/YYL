
public class NextDay {
	int year,month,day;
	String msg;
	public NextDay(String date)
	{
		try {
			parse(date);
			if(month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
				if(day>31)
					msg="�������ܴ���31";
				else
				{
					if(day==31) {
						if(month==12)
						    msg="��һ��Ϊ "+(year+1)+"-1-1";
						else
							msg="��һ��Ϊ "+(year+1)+"-"+(month+1)+"-1";
					}else
						msg="��һ��Ϊ"+year+"-"+month+"-"+(day+1);
				}
			}
			else if(month==2) {
				if(year%4==0&&year%100!=0||year%400==0) {
					if(day>29)
						msg="����2���������ܴ���29";
					else
					{
						if(day==29) 
							msg="��һ��Ϊ"+year+"-3-1";
						else
						    msg="��һ��Ϊ"+year+"-"+month+"-"+(day+1);
					}
				}
				else {
					if(day>28)
						msg="ƽ��2���������ܴ���28";
					else {
						if(day==28) 
							msg="��һ��Ϊ"+year+"-3-1";
						else
						    msg="��һ��Ϊ"+year+"-"+month+"-"+(day+1);
					}
				}
			}else {
				if(day>30)
					System.out.println("���µ��������ܴ���30");
				else {
					if(day==30) 
						msg="��һ��Ϊ"+year+"-"+(month+1)+"-1";
					else
					    msg="��һ��Ϊ"+year+"-"+month+"-"+(day+1);
				}
			}
				
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
     public boolean isDigit(char c){
    	 if(c>='0'&&c<='9')
    		 return true;
    	 return false;
     }
     private void parse(String date) throws Exception
     {
    	 int num=0,i;
    	 char c;
    	 for(i=0;(c=date.charAt(i))!='-'&&i<date.length();i++) {
    	     if(isDigit(c))
    			 num=num*10+c-'0';
    		 else
    			 throw new Exception("��������쳣");
    	 }
    	 year=num;
    	 if(date.charAt(i)!='-')
    		 throw new Exception("δ������ȷ����");
    	 i++;
    	 num=0;
         while((c=date.charAt(i))!='-'&&i<date.length()) {
        	 if(isDigit(c))
    			 num=num*10+c-'0';
    		 else
    			 throw new Exception("�����·��쳣");
        	 i++;
         }
         if(date.charAt(i)!='-')
         	throw new Exception("δ������ȷ����");
         if(num>12||num==0)
        		throw new Exception("δ������ȷ�·�");
         month=num;
     	for(i++,num=0;i<date.length();i++) {
     		c=date.charAt(i);
     		if(isDigit(c))
   			 num=num*10+c-'0';
   		 else
   			 throw new Exception("���������쳣");
     	}
     	day=num; 
     }
     public String getMsg() {
    	 return msg;
     }
}