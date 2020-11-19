package site.ycsb.db.rocksdb;

import org.junit.*;
import org.rocksdb.*;
import static org.junit.Assert.assertEquals;

public class RocksDBTest {

  @Test
  public void statsLevelTest() {
    assertEquals(StatsLevel.EXCEPT_DETAILED_TIMERS.getValue(), 0);
    assertEquals(StatsLevel.EXCEPT_TIME_FOR_MUTEX.getValue(), 1);
    assertEquals(StatsLevel.ALL.getValue(), 2);
  }
}
