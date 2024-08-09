import java.util.*;
public class FB2 {

   /* We are profiling the performance of some app. In order to do that, app is instrumented to log events for beginning and end of each function. An event is a record with three fields: 1. function name 2. timestamp 3. type (begin or end)
    Example:
    foo, 10, b
    bar, 20, b
    bar, 50, e
    foo, 100, e

    Given such a log, compute exclusive running time for each function (exclusive time excludes time spent in function's sub-routines).
            For above example the expected output is:
            foo: 60
            bar: 30*/



        public static Map<String, Integer> calculateExclusiveTime(List<String[]> logs) {
            Map<String, Integer> result = new HashMap<>();
            Stack<String[]> stack = new Stack<>();

            for (String[] log : logs) {
                String functionName = log[0];
                int timestamp = Integer.parseInt(log[1]);
                String type = log[2];

                if (type.equals("b")) {  // 'b' for begin
                    stack.push(log);
                } else {  // 'e' for end
                    String[] startLog = stack.pop();
                    String startFunction = startLog[0];
                    int startTime = Integer.parseInt(startLog[1]);

                    int duration = timestamp - startTime;
                    result.put(startFunction, result.getOrDefault(startFunction, 0) + duration);

                    if (!stack.isEmpty()) {
                        String[] parentLog = stack.peek();
                        String parentFunction = parentLog[0];
                        result.put(parentFunction, result.getOrDefault(parentFunction, 0) - duration);
                    }
                }
            }

            return result;
        }

        public static void main(String[] args) {
            List<String[]> logs = new ArrayList<>();
            logs.add(new String[]{"foo", "10", "b"});
            logs.add(new String[]{"bar", "20", "b"});
            logs.add(new String[]{"bar", "50", "e"});
            logs.add(new String[]{"foo", "100", "e"});

            Map<String, Integer> exclusiveTime = calculateExclusiveTime(logs);
            for (Map.Entry<String, Integer> entry : exclusiveTime.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }

