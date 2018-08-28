package com.github.klauswk;

import java.lang.management.ManagementFactory;

import javax.management.MBeanServer;
import javax.management.ObjectName;

import com.github.klauswk.impl.SystemMBeanShutdown;

public class Main {
	
	public static void main(String[] args) throws Exception {
        MBeanServer mbs = ManagementFactory.getPlatformMBeanServer(); 
        ObjectName name = new ObjectName("com.github.klauswk:type=SystemMbean"); 
        SystemMBeanShutdown mbean = new SystemMBeanShutdown(); 
        mbs.registerMBean(mbean, name); 
          
        System.out.println("Waiting forever..."); 
        Thread.sleep(Long.MAX_VALUE); 
	}
	
}
