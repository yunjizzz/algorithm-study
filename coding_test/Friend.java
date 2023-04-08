package coding_test;

import java.util.*;

public class Friend {
    private Collection<Friend> friends;
    private String email;

    public Friend(String email) {
        this.email = email;
        this.friends = new ArrayList<Friend>();
    }

    public String getEmail() {
        return email;
    }

    public Collection<Friend> getFriends() {
        return friends;
    }

    public void addFriendship(Friend friend) {
        friends.add(friend);
        friend.getFriends().add(this);
    }

    public boolean canBeConnected(Friend friend) {
        Set<Friend> visited = new HashSet<>(); // 방문 체크용

        // DFS 현재 시작 넣고
        Queue<Friend> queue = new LinkedList<>();
        queue.add(this);

        while (!queue.isEmpty()) {
            Friend findFriend = queue.remove(); // 큐에서 하나 꺼내고
            if (findFriend == friend) {
                return true;
            }
            visited.add(findFriend); // 방문 체크

            // 만약 해당 친구가 가진 친구 중에 방문 안한 곳 있으면  큐에 추가
            for (Friend visitedFriend : findFriend.getFriends()) {
                if (!visited.contains(visitedFriend)) {
                    queue.add(visitedFriend);
                }
            }
        }
        // 연결 안 되어 있으면 친구 X
        return false;
    }

    public static void main(String[] args) {
        Friend a = new Friend("A");
        Friend b = new Friend("B");
        Friend c = new Friend("C");

        a.addFriendship(b);
        b.addFriendship(c);

        System.out.println(a.canBeConnected(c));
    }
}