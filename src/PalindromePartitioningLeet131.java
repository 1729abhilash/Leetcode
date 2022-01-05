public class PalindromePartitioningLeet131 {

        public List<List<String>> partition(String s) {

            List<List<String>> res=new ArrayList<>();
            if(s.length()==0)
                return res;


            helper(res,new ArrayList<>(),s);
            return res;

        }

        private void helper(List<List<String>> res,List<String> list,String s)
        {
            if(s.length()==0)
            {
                res.add(new ArrayList(list));
                return ;
            }


            for(int i=0;i<s.length();i++)
            {
                String firstPart =s.substring(0,i+1);

                if(isPalindrome(firstPart))
                {
                    list.add(firstPart);
                    String secondPart=s.substring(i+1,s.length());
                    helper(res,list,secondPart);
                    list.remove(list.size()-1);
                }
            }


        }

        private boolean isPalindrome(String s)
        {
            StringBuilder sb=new StringBuilder(s);
            return s.equals(sb.reverse().toString());




        }

    }

