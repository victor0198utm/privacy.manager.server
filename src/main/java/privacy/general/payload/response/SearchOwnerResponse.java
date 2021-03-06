package privacy.general.payload.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import privacy.general.payload.request.SearchAllOwnersRequest;
import privacy.models.new_friend.FriendshipRequestCreated;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SearchOwnerResponse {
    private  List<SearchAllOwnersRequest> usersFound = new ArrayList<>();

}