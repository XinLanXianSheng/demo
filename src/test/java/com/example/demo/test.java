package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test {

	public static void main(String[] args) {
		List<String> level = new ArrayList<>();
		level.add("无危");
		level.add("低危");
		level.add("中危");
		level.add("高危");
		level.add("严重");
		Map<String,Object> map = new HashMap<>();
		List<Object> lists = new ArrayList<>();
		for(int j = 0; j < 7; j++) {
			// a
			List<datas> data = null;//这个null用j传1到6
			String [] ss = {};
			// 星期
			for (int i = 0; i < data.size(); i++) {
				for(int z = 0; z < level.size(); z++) {
					if (data.get(i).getVuln_level().equals(level.get(z))) {
						ss[z] = (data.get(i).getCoutn());
					}else {
						ss[z] = "0";
					}
				}
			}
			lists.add(ss);
		}
		map.put("datas", lists);

	}
}

//SELECT
//COUNT(*) counts,
//vuln_level
//FROM
//tb_vulnerability
//WHERE
//<if test="a != null and a!='' and a<8 and a>0">
//DATE_FORMAT(opt_time, '%Y-%m-%d') = DATE_SUB(
//	DATE_FORMAT(now(), '%Y-%m-%d'),
//	INTERVAL 6 DAY
//)
//</if>
//GROUP BY
//vuln_level;

