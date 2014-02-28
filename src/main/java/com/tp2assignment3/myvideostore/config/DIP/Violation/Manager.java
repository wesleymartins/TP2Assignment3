/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tp2assignment3.myvideostore.config.DIP.Violation;

/**
 *
 * @author student
 */
public class Manager {
    
    //Object from class Worker
	StoreClerk storeclerk;

	public void setStoreClerk(StoreClerk sc)
	{
		storeclerk = sc;
	}

	public void manage()
	{
		storeclerk.work();
	}
    
}
