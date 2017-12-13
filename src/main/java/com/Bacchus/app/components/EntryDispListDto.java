package  com.Bacchus.app.components;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 参加可否表示用リストDTO。
 *
 * @author ishigouoka_k
 * $Id:$
 */
public class EntryDispListDto extends UserDto implements Serializable {

    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** 参加DTOリスト */
    private List<EntryDto> entryDtoList = new ArrayList<EntryDto>();

    /**
     * 参加DTOリストの取得。
     *
     * @return 参加DTOリスト
     */
    public List<EntryDto> getEntryDtoList() {
        return this.entryDtoList;
    }

    /**
     * 参加DTOリストを設定。
     *
     * @param entryDtoList 参加DTOリスト
     */
    public void setEntryDtoList(List<EntryDto> entryDtoList) {
        this.entryDtoList = entryDtoList;
    }
}
