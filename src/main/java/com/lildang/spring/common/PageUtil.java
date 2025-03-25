package com.lildang.spring.common;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class PageUtil {
	public Map<String, Integer> generatePageInfo(int totalCount, int currentPage) {
		Map<String, Integer> pageInfo = new HashMap<String, Integer>();
		//boardLimit=10에서 9로수정함!다른곳에서도 영향받을듯!!다시10
		int boardLimit = 10;
		int maxPage = 0;
		if(totalCount % boardLimit !=0) {
			maxPage = totalCount /boardLimit +1;
		}else {
			maxPage = totalCount /boardLimit;
		}
		int naviLimit = 5;
		
		int startNavi = ((currentPage-1)/naviLimit)*naviLimit+1;
		int endNavi = (startNavi-1)+naviLimit;
		if(endNavi > maxPage ) {
			endNavi = maxPage;
		
	}
		pageInfo.put("maxPage", maxPage);
		pageInfo.put("startNavi", startNavi);
		pageInfo.put("endNavi", endNavi);
		return pageInfo;
		
}
}
