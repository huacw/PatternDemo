package com.sea.pattern.subscribe;

import com.sea.pattern.subscribe.impl.Watched;
import com.sea.pattern.subscribe.impl.Watcher;


public class Main {

	public static void main(String[] args) {
		IWatched watched = new Watched();
        
        IWatcher watcher1 = new Watcher();
        IWatcher watcher2 = new Watcher();
        IWatcher watcher3 = new Watcher();
        
        watched.addWatcher(watcher1);
        watched.addWatcher(watcher2);
        watched.addWatcher(watcher3);
        
        watched.notifyWatchers("老板回来了");
        
        System.out.println();
        
        watched.removeWatcher(watcher2);
        watched.notifyWatchers("老板回来了");

	}

}
