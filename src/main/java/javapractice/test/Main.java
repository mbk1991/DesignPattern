package main.java.javapractice.test;

import java.lang.management.ManagementFactory;
import com.sun.management.OperatingSystemMXBean;
import java.nio.file.FileStore;
import java.nio.file.FileSystems;

public class Main {
    public static void main(String[] args){
        Iterable<FileStore> fileStores = FileSystems.getDefault().getFileStores();
        System.out.println("디스크 정보");
        for(FileStore fileStore : fileStores){
            System.out.println("디스크이름 : " + fileStore.toString());
            try{
                System.out.println("디스크 전체 크기 : " + fileStore.getTotalSpace());
                System.out.println("사용가능한 디스크 크기 : " + fileStore.getUsableSpace());
            } catch (Exception e){

            }
        }
        System.out.println();

        OperatingSystemMXBean osBean = (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();



        System.out.println("CPU 정보:" );
        System.out.println("프로세서 수: " + osBean.getAvailableProcessors());
        System.out.println("시스템 부하: " + osBean.getSystemLoadAverage());


    }
}
