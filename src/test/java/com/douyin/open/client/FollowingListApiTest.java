
package com.douyin.open.client;

import com.douyin.open.ApiException;
import com.douyin.open.model.FollowingListResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
/**
 * API tests for FollowingListApi
 */
@Ignore
public class FollowingListApiTest {

    private final FollowingListApi client = new FollowingListApi();

    /**
     * 获取关注列表
     *
     * * Scope: &#x60;following.list&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void followingListGetTest() throws ApiException {
        String openId = "ba253642-0590-40bc-9bdf-9a1334b94059";
        String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr";
        Long count = 10;
        Long cursor = 0;
        FollowingListResponse response = client.followingListGet(openId, accessToken, count, cursor);

        // TODO: 检验返回结果
        System.out.println(response);
    }
}
