package clone.twitter.dto;

import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class AppUserDTO {

    private UUID id;

    private String imgPath;

    private String username;

    private List<PostDTO> posts;

    private List<PostDTO> likedPosts;

    private List<PostDTO> dislikedPosts;
}
