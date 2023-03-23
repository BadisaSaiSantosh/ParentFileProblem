import java.*;
class FileSpaceing{
    public static void main(String[] args) throws FileNotFoundException {
        // String[] fileNames = {"File1", " File2", "  File3", "File4", "File5"};
        File fileName=new File('InputValuesFile.txt');
        Scanner read=new Scanner(fileName);
        String[] fileNames=new String[5];
        for(int i=0;i<filenames.length;i++){
            fileNames[i]=read.nextLine();
        }
              strCheck(fileNames);
    }
     
    public static void strCheck(String[] fileNames){
        Map<String,String> fileMap=new HashMAp<>();
        fileMap.put("File1",null);
        for(int i=0;i<fileNames.length;i++){
            String currFile=fileNames[i].trim();
            int  numspaces=fileNames[i].length()-currFile.length();
            if(numspaces==i){
                fileName.put(currFile,"File1");
            }
            else if(numspaces>1){
                String parentFile=fileNames[i-1].trim();
                fileMap.put(currFile,parentFile);
            }
            else
               fileMap.put(currFile,null);

        }


    }

    System.out.println("  fileName   ,   ParentFile" );
    System.out.println("------------  --------------");
    for(String f:fileMap.keySet()){
        System.out.printf(f,fileMap.get(f));
    }


}


// -----------output---------------
// FileName                 ParentFile
// ==========   ==========
// File5                        null
// File4                        File1
// File3                        File2
// File2                        File1
// File1                        null
