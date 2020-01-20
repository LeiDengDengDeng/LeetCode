package deng.medium;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author deng
 * @date 2020/01/20
 */
public class FindDuplicateFileInSystem {
    public List<List<String>> findDuplicate(String[] paths) {
        if (paths == null || paths.length == 0) {
            return Collections.EMPTY_LIST;
        }

        Map<String, List<String>> map = new HashMap<>();

        for (String path : paths) {
            String[] files = path.split(" ");

            for (int i = 1; i < files.length; i++) {
                handelFile(map, files[0], files[i]);
            }
        }

        return map.values().stream().filter(list -> list.size() > 1).collect(Collectors.toList());
    }

    public void handelFile(Map<String, List<String>> map, String dir, String file) {
        int leftBracketLoc = file.lastIndexOf('(');
        String content = file.substring(leftBracketLoc + 1, file.length() - 1);
        String completePath = dir + "/" + file.substring(0, leftBracketLoc);

        List<String> paths = map.getOrDefault(content, new LinkedList<>());
        paths.add(completePath);
        map.putIfAbsent(content, paths);
    }
}
