package com.hanains.composite;


/*
 
 	Composite Pattern
 	
 	  - 추상적인 상위 클래스 하나를 만들고 그 클래스를 상속받는 다양한 자식들을 만들어 결국, 
 	  	다양한 자식 객체들을 같은 종류의 객체를 다루듯이 동일 시 해서 사용하겠다는 패턴이다.
 	 ex) 폴더 안의 파일 출력.(폴더는 출력이 안된다.)
 	 
 	 구조.
 	 root ---- folder1 ---- SubFolder1 ---- SubFile1
 	 						SubFolder1 ---- SubFile2
 	 						SubFolder1 ----	SubFile3
 	 						SubFolder2
 	 						File1
 	 		   folder2 ---- file1
 	 		   				file2
 	 		   folder3
  
  */


public class ComponentTest {

	
	public static void main(String[] args) throws Exception {
	
		Folder rootFolder = new Folder("root");
		Folder folder1 = new Folder("folder1");
		Folder folder2 = new Folder("folder2");
		Folder folder3 = new Folder("folder3");
	
		rootFolder.add(folder1);
		rootFolder.add(folder2);
		rootFolder.add(folder3);
		
		folder1.add(new File("file1", 100));
		folder2.add(new File("file2", 100));
		folder2.add(new File("file3", 300));
		
		Folder subFolder1 = new Folder("subFolder1");
		Folder subFolder2 = new Folder("subFolder2");
		
		folder1.add(subFolder1);
		folder1.add(subFolder2);
		
		subFolder1.add(new File("subFile1", 100));
		subFolder1.add(new File("subFile2",100));
		subFolder1.add(new File("subFile3",200));
		
		rootFolder.printList();
		System.out.println( "Total Size : "+ rootFolder.getSize() );
		
	}
	
	
}
