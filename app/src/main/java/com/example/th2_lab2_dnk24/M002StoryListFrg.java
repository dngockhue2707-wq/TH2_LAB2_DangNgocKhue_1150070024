package com.example.th2_lab2_dnk24;

import android.os.Bundle;
import android.view.*;
import android.widget.*;
import androidx.fragment.app.Fragment;
import java.util.*;

public class M002StoryListFrg extends Fragment {
    private static final String ARG_TOPIC = "topic";
    private String topic;
    private ListView lvStories;

    public static M002StoryListFrg newInstance(String topic) {
        M002StoryListFrg f = new M002StoryListFrg();
        Bundle args = new Bundle();
        args.putString(ARG_TOPIC, topic);
        f.setArguments(args);
        return f;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.m002_frg_story_list, container, false);
        lvStories = view.findViewById(R.id.lvStories);
        TextView tvTopicTitle = view.findViewById(R.id.tvTopicTitle);

        topic = getArguments().getString(ARG_TOPIC);
        tvTopicTitle.setText("Chủ đề: " + topic);

        List<String> storyTitles = new ArrayList<>();
        List<String> storyContents = new ArrayList<>();

        switch (topic) {
            case "Con gái":
                storyTitles = Arrays.asList(
                        "Việc học", "Lời hứa dễ thương", "Con gái và thời tiết", "Tình yêu logic", "Cuộc gọi nửa đêm",
                        "Thử thách giảm cân", "Bí mật son môi", "Người yêu và giày cao gót", "Đòi quà sinh nhật", "Suy nghĩ phức tạp"
                );
                storyContents = Arrays.asList(
                        "Một cô gái nói với mẹ: 'Con học mãi mà điểm vẫn thấp!' – Mẹ cười đáp: 'Nếu con học giỏi thì thầy đâu có việc làm nữa con ơi!'",
                        "Cô gái hỏi bạn trai: 'Anh có yêu em mãi không?' – Anh chàng đáp: 'Ừ, cho đến khi điện thoại anh hết pin!'",
                        "Cô gái bảo: 'Anh ơi, ngoài kia mưa to lắm!' – Anh: 'Vậy em đừng ra!' – 'Nhưng em đang đứng ngoài cửa nhà anh nè!'",
                        "Anh chàng nói: 'Em giận anh vô lý lắm!' – Cô gái đáp: 'Không vô lý thì còn gì là con gái nữa!'",
                        "Cô gái nhắn tin lúc 2h sáng: 'Anh đang làm gì đó?' – Anh: 'Ngủ...' – 'À, vậy thôi, em chỉ muốn chắc anh không mơ thấy ai khác!'",
                        "Cô gái nói: 'Từ hôm nay em sẽ giảm cân!' – 5 phút sau, cô đăng story: 'Ai đi ăn buffet khôngggg 😋'",
                        "Cô gái than: 'Son môi của em biến mất rồi!' – Anh chàng cười: 'Chắc tại nó theo anh rồi, vì anh dính đầy son đây!'",
                        "Anh chàng hỏi: 'Sao em không đi giày cao gót nữa?' – 'Vì anh thấp hơn em 3cm, em không muốn làm tổn thương lòng tự trọng của anh đâu!'",
                        "Cô gái nhắn: 'Anh tặng gì cho sinh nhật em?' – Anh: 'Bí mật!' – 'Thôi khỏi, bí mật là cách nói sang chảnh của việc chưa mua quà đúng không?'",
                        "Cô gái nghĩ: 'Anh ấy đăng ảnh đồ ăn… chắc đang nhớ em.' – 5 giây sau: 'Ủa sao lại tag người khác?' 😭"
                );
                break;

            case "Học sinh":
                storyTitles = Arrays.asList(
                        "Giờ kiểm tra", "Thầy và trò", "Cái bảng trắng", "Tình bạn trong lớp", "Bữa trưa nhớ đời",
                        "Thi cử gay cấn", "Chuyện vở bài tập", "Đồng phục ngày mưa", "Cúp học bất đắc dĩ", "Lý do đi học muộn"
                );
                storyContents = Arrays.asList(
                        "Trong giờ kiểm tra, thầy hỏi: 'Em chép bài à?' – Học sinh đáp: 'Dạ không, em chỉ tham khảo chút thôi!'",
                        "Thầy hỏi: 'Ai phát minh ra điện?' – Trò đáp: 'Em không biết, hôm qua cúp điện em ngủ mất!'",
                        "Một học sinh viết lên bảng: 'Hôm nay không học, mai học bù' – cả lớp vỗ tay như được nghỉ lễ!",
                        "Cậu học trò bị thầy mắng: 'Sao em cười suốt buổi?' – 'Dạ, em đang nhớ lại bài cũ mà em không hiểu nổi! 😂'",
                        "Cả lớp cùng ăn trưa, một bạn hét lên: 'Cơm của ai có khói vậy?' – 'Của tớ đó, tại mẹ tớ quên tắt bếp!'",
                        "Học sinh 1: 'Thi trắc nghiệm dễ hơn thi tự luận!' – Học sinh 2: 'Ờ, vì khoanh bừa còn có cơ hội sống sót!'",
                        "Thầy hỏi: 'Vở bài tập đâu?' – Học sinh: 'Em để ở nhà cho nó khỏi hư!'",
                        "Một ngày mưa to, thầy bảo: 'Ai không mặc đồng phục sẽ bị ghi tên!' – Cả lớp ướt sũng mà vẫn tươi cười!",
                        "Thầy hỏi: 'Sao em nghỉ học hôm qua?' – Trò: 'Em đang test xem lớp có nhớ em không ạ!'",
                        "Bạn bị đi học muộn, thầy hỏi: 'Sao giờ này mới tới?' – 'Tại chuông báo thức của em ngủ quên luôn rồi thầy ơi!'"
                );
                break;

            case "Gia đình":
                storyTitles = Arrays.asList(
                        "Mẹ và con", "Ông nội vui tính", "Bố nấu ăn", "Anh trai và em gái", "Cả nhà xem phim",
                        "Ngày chủ nhật", "Cuộc họp gia đình", "Bí mật trong tủ lạnh", "Chú chó thông minh", "Sinh nhật bà nội"
                );
                storyContents = Arrays.asList(
                        "Mẹ hỏi: 'Con sao chưa rửa chén?' – Con đáp: 'Con đang để chén ngấm xà phòng cho sạch hơn mẹ ơi!'",
                        "Ông nội kể chuyện: 'Ngày đó ông đẹp trai lắm, đi đâu ai cũng nhìn!' – Cả nhà im lặng vì không ai tin nổi!",
                        "Bố bảo: 'Hôm nay bố trổ tài!' – Cả nhà ăn mì tôm trứng... và uống nước lọc cho đỡ cay!",
                        "Anh trai dọa: 'Nói với mẹ là anh lấy bánh nha!' – Em gái đáp: 'Em quay video rồi, giờ là bằng chứng!'",
                        "Cả nhà xem phim kinh dị, mẹ nhắm mắt, bố cười, con hét – và cái tivi tắt vì... cúp điện!",
                        "Ngày chủ nhật, ai cũng muốn ngủ – riêng bố dậy sớm bật nhạc 7 giờ sáng. Kết quả: cả nhà thức theo!",
                        "Bố mở cuộc họp gia đình: 'Ai làm đổ nước ra sàn?' – Cả nhà nhìn nhau. Cuối cùng con mèo bị quy tội 😹",
                        "Mẹ mở tủ lạnh: 'Ai để hộp sữa trống đây?' – Con trai đáp: 'Để làm mẫu cho lần sau khỏi mua nhầm vị!'",
                        "Chú chó trong nhà biết tự mở cửa. Hôm nọ nó chạy ra ngoài rồi quay lại... cắn gói snack đem về!",
                        "Sinh nhật bà nội, cả nhà tặng bánh, hoa, quà... Bà cười: 'Lần sau tặng phong bì được không, đỡ cực!'"
                );
                break;
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(),
                R.layout.item_story, R.id.tvTitle, storyTitles);
        lvStories.setAdapter(adapter);

        List<String> finalStoryTitles = storyTitles;
        List<String> finalStoryContents = storyContents;

        lvStories.setOnItemClickListener((parent, v, pos, id) -> {
            ((MainActivity) requireActivity()).gotoM003Screen(
                    finalStoryTitles.get(pos),
                    finalStoryContents.get(pos)
            );
        });

        return view;
    }
}
