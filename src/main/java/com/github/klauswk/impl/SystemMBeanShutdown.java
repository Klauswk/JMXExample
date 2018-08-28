package com.github.klauswk.impl;

import com.github.klauswk.mbean.SystemMXBean;

public class SystemMBeanShutdown implements SystemMXBean {
	@Override
	public void shutdown() {
		System.out.println("Shutting down application");
		System.exit(0);
	}
}