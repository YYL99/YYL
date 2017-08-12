
public class NextDay {
	int year,month,day;
	String msg;
	public NextDay(String date)
	{
		try {
			parse(date);
			if(month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
				if(day>31)
					msg="天数不能大于31";
				else
				{
					if(day==31) {
						if(month==12)
						    msg="下一天为 "+(year+1)+"-1-1";
						else
							msg="下一天为 "+(year+1)+"-"+(month+1)+"-1";
					}else
						msg="下一天为"+year+"-"+month+"-"+(day+1);
				}
			}
			else if(month==2) {
				if(year%4==0&&year%100!=0||year%400==0) {
					if(day>29)
						msg="闰年2月天数不能大于29";
					else
					{
						if(day==29) 
							msg="下一天为"+year+"-3-1";
						else
						    msg="下一天为"+year+"-"+month+"-"+(day+1);
					}
				}
				else {
					if(day>28)
						msg="平年2月天数不能大于28";
					else {
						if(day==28) 
							msg="下一天为"+year+"-3-1";
						else
						    msg="下一天为"+year+"-"+month+"-"+(day+1);
					}
				}
			}else {
				if(day>30)
					System.out.println("该月的天数不能大于30");
				else {
					if(day==30) 
						msg="下一天为"+year+"-"+(month+1)+"-1";
					else
					    msg="下一天为"+year+"-"+month+"-"+(day+1);
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
    			 throw new Exception("输入年份异常");
    	 }
    	 year=num;
    	 if(date.charAt(i)!='-')
    		 throw new Exception("未输入正确日期");
    	 i++;
    	 num=0;
         while((c=date.charAt(i))!='-'&&i<date.length()) {
        	 if(isDigit(c))
    			 num=num*10+c-'0';
    		 else
    			 throw new Exception("输入月份异常");
        	 i++;
         }
         if(date.charAt(i)!='-')
         	throw new Exception("未输入正确日期");
         if(num>12||num==0)
        		throw new Exception("未输入正确月份");
         month=num;
     	for(i++,num=0;i<date.length();i++) {
     		c=date.charAt(i);
     		if(isDigit(c))
   			 num=num*10+c-'0';
   		 else
   			 throw new Exception("输入天数异常");
     	}
     	day=num; 
     }
     public String getMsg() {
    	 return msg;
     }
}