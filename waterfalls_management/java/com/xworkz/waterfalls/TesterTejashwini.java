package com.xworkz.waterfalls;

import org.hibernate.SessionFactory;

public class TesterTejashwini {

	public static void main(String[] args) {

		SessionFactory factory = SFUtil.getfactory();
		System.out.println(factory);
	}

}
