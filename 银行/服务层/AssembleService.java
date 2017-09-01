package 服务层;

import java.io.IOException;
import java.util.Map;

import 信息缓存.AccountCache;
import 内容.Account;
import 内容.WrapData;
import 实现层.AssembleHandler;

public class AssembleService {
	
	//调用 handler 层 进行装配
	private AssembleHandler handler = new AssembleHandler();
	
	//用来暂存  所有的账户们
	private Map<String , Account> accounts ;

	//
	public void LoadAccounts() throws IOException {
		
		//加载账户信息
		accounts = handler.LoadAccounts();
		
		WrapData wrapData = new WrapData();
		wrapData.setAccounts(accounts);
		
		AccountCache.getInstance().setWrapData(wrapData);
	}


}
