package labelmarker;

import com.github.loki4j.slf4j.marker.LabelMarker;

import java.util.Map;

/**
 * Label 기반 조회 쿼리 생성 -> 카디널리티가 낮아야 편함 -> 동적 라벨 생성은 사용 안 하는게 좋음
 * + LabelMarker는 다른 Marker와 합치는게 불가능해서 단독으로만 사용가능함
 *
 */
public class CreateLabelMarker {

    void example() {
        var result = LabelMarker.of(() ->
                Map.of(
                        "key1", "value",
                        "key2", "value"
                )
        );
    }
}


