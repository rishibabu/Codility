# Codility

       Scanner scan = new Scanner(System.in);
        Integer numberOfLines = scan.nextInt();
        HashMap<Integer, List<Integer>> mapOfLists = new HashMap<>();

        for (int i = 1; i <= numberOfLines; i++) {
            Integer NumberOflineItems = scan.nextInt();
            List<Integer> dynamiArrayList = new ArrayList<Integer>();
            for(int j=0;j<NumberOflineItems;j++)
            {
                Integer lineItems = scan.nextInt();
                
                if (dynamiArrayList.isEmpty()) {
                    dynamiArrayList.add(lineItems);
                    mapOfLists.put(i, dynamiArrayList);

                }

                else {
                    mapOfLists.get(i).add(lineItems);

                }

            }
            

        }

        
        
        Integer queries = scan.nextInt();
        
        
        for(int k=0;k<queries;k++)
        {
            Integer pos = scan.nextInt();
            Integer line = scan.nextInt();
            
            try {
                
                System.out.println(mapOfLists.get(line).get(pos));
            }
            
            catch(Exception ex)
            {
                System.out.println("ERROR!");

            }
            
        }

        
        scan.close();

    }

        
