package lynn.easy;

import java.util.*;

/**
 * Created by liying on 2018/10/26.
 */
public class subDomainVisitCount {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : cpdomains) {
            String[] timesAndDomains = s.split(" ");
            String domains = timesAndDomains[1];
            String[] domainSplit = domains.split("\\.");
            for (int i = 0; i < domainSplit.length; i++) {
                int time = Integer.parseInt(timesAndDomains[0]);
                String domain = "";
                for (int j = i; j < domainSplit.length; j++) {
                    domain += domainSplit[j];
                    if (j != domainSplit.length - 1) {
                        domain += ".";
                    }
                }
                if (map.containsKey(domain)) {
                    time += map.get(domain);
                }
                map.put(domain, time);
            }
        }
        List<String> res = new ArrayList<>();
        for (String s : map.keySet()) {
            res.add(map.get(s) + " " + s);
        }


        return res;
    }


    public static void main(String[] args) {
        subDomainVisitCount subDomainVisitCount = new subDomainVisitCount();
        List<String >res=subDomainVisitCount.subdomainVisits(new String[]{"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"});
        System.out.println(res);
    }
}
