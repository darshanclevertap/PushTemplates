package com.clevertap.pushtemplates;

import java.util.ArrayList;

@SuppressWarnings("WeakerAccess")
public class Constants {
    public static final String LOG_TAG = "PTLog";
    public static final ArrayList<Integer> PT_DO_NOT_EDIT_LIST = new ArrayList<>() ;
    public static final String PT_MANUAL_CAROUSEL_CURRENT = "pt_manual_carousel_current";
    public static final String PT_IMAGE_LIST = "pt_image_list";
    public static final String PT_DEEPLINK_LIST = "pt_deeplink_list";
    public static final String PT_FLIP_INTERVAL = "pt_flip_interval";
    public static final String PT_FLIP_INTERVAL_TIME = "4000";
    public static final String PT_DIR = "pt_dir";
    public static final String PT_SOUND_FILE_NAME = "pt_silent_sound";
    public static boolean PT_FALLBACK = false;
    public static String PT_IMAGE_PATH_LIST = "" ;
    static final int ONE_SECOND = 1000;
    static final String DEFAULT_DL = "default_dl";
    public static final String WZRK_ACTIONS = "wzrk_acts";
    public static final String WZRK_CHANNEL_ID = "wzrk_cid";
    public static final String WZRK_PUSH_ID = "wzrk_pid";
    public static final String WZRK_DL = "wzrk_dl";
    public static final String WZRK_FROM_KEY = "wzrk_from";
    public static final String WZRK_FROM = "CTPushNotificationReceiver";
    public static final int EMPTY_NOTIFICATION_ID = -1000;
    public static final String NOTIF_TAG = "wzrk_pn";
    public static final String ICON_BASE_URL = "http://static.wizrocket.com/android/ico/";
    public static final String LABEL_NOTIFICATION_ICON = "CLEVERTAP_NOTIFICATION_ICON";
    public static final String PT_ID = "pt_id";
    public static final String PT_NOTIF_ICON = "pt_ico";
    public static final String PT_TITLE = "pt_title";
    public static final String PT_MSG = "pt_msg";
    public static final String PT_MSG_SUMMARY = "pt_msg_summary";
    public static final String PT_TITLE_COLOR = "pt_title_clr";
    public static final String PT_MSG_COLOR = "pt_msg_clr";
    public static final String PT_BG = "pt_bg";
    public static final String PT_BIG_IMG = "pt_big_img";
    public static final String PT_SMALL_IMG = "pt_small_img";
    public static final String PT_JSON = "pt_json";
    public static final String PT_BUY_NOW_DL = "pt_buy_now_dl";
    public static final String PT_DEFAULT_DL = "pt_default_dl";
    public static final String PT_SMALL_VIEW = "pt_small_view";
    public static final String PT_TIMER_THRESHOLD = "pt_timer_threshold";
    public static final String PT_INPUT_LABEL = "pt_input_label";
    public static final String PT_INPUT_KEY = "pt_input_reply";
    public static final String PT_INPUT_FEEDBACK = "pt_input_feedback";
    public static final int PT_INPUT_TIMEOUT = 1300;
    public static final String PT_NOTIF_ID = "notificationId";
    public static final String PT_INPUT_AUTO_OPEN = "pt_input_auto_open";
    public static final String PT_EVENT_NAME_KEY = "pt_event_name";
    public static final String PT_EVENT_PROPERTY_KEY = "pt_event_property";
    public static final String PT_EVENT_PROPERTY_SEPERATOR = "pt_event_property_";
    public static final String PT_DISMISS_ON_CLICK ="pt_dismiss_on_click";
    public static final String PT_CHRONO_TITLE_COLOUR = "pt_chrono_title_clr";
    public static final String PT_VIDEO_URL = "pt_video_url";
    public static final String PT_PRODUCT_DISPLAY_ACTION = "pt_product_display_action";
    public static final String PT_PRODUCT_DISPLAY_ACTION_COLOUR = "pt_product_display_action_clr";
    public static final String PT_TIMER_END = "pt_timer_end";
    public static final String PT_TIMER_SPLIT = "$D_";
    public static final int PT_TIMER_MIN_THRESHOLD = 10;
    public static final String PT_BIG_IMG_ALT = "pt_big_img_alt";
    public static final String PT_TITLE_ALT = "pt_title_alt";
    public static final String PT_MSG_ALT = "pt_msg_alt";
    public static final String PT_PRODUCT_DISPLAY_LINEAR = "pt_product_display_linear";
    public static final int PT_VIDEO_WIDTH = 350;
    public static final int PT_VIDEO_HEIGHT = 210;
    public static final String WZRK_CLR = "wzrk_clr";
    public static final String PT_PRODUCT_DISPLAY_ACTION_TEXT_COLOUR = "pt_product_display_action_text_clr";
    public static final String PT_SMALL_ICON_COLOUR = "pt_small_icon_clr";
    public static final String WZRK_BIG_PICTURE = "wzrk_bp";
    public static final String WZRK_MSG_SUMMARY = "wzrk_nms";
    public static final String NOTIF_PRIORITY = "pr";
    public static final String PRIORITY_HIGH = "high";
    public static final String PRIORITY_MAX = "max";
    public static final String WZRK_COLLAPSE = "wzrk_ck";
    public static final String WZRK_BADGE_ICON = "wzrk_bi";
    public static final String WZRK_BADGE_COUNT = "wzrk_bc";
    public static final String WZRK_SUBTITLE = "wzrk_st";
    public static final String WZRK_COLOR = "wzrk_clr";
    public static final String WZRK_SOUND = "wzrk_sound";
    public static final String WZRK_TIME_TO_LIVE = "wzrk_ttl";
    public static final String PT_META_CLR = "pt_meta_clr";
    public static final String NOTIF_MSG = "nm";
    public static final String NOTIF_TITLE = "nt";
    public static final String PT_CANCEL_NOTIF_ID = "pt_cancel_notif_id";
    public static final String PT_ACTION_ID = "actionId";
    public static final String PT_RIGHT_SWIPE = "right_swipe";
    public static final String PT_MANUAL_CAROUSEL_FROM = "manual_carousel_from";
    public static final String PT_REQUEST_CODE_0 = "pt_reqcode0";
    public static final String PT_REQUEST_CODE_1 = "pt_reqcode1";
    public static final String PT_REQUEST_CODE_2 = "pt_reqcode2";
    public static final String PT_REQUEST_CODE_3 = "pt_reqcode3";
    public static final String PT_IMAGE_1 = "img1";
    public static final String PT_IMAGE_2 = "img2";
    public static final String PT_IMAGE_3 = "img3";
    public static final String PT_BUY_NOW = "buynow";
    public static final String TEXT_ONLY = "text_only";
    public static final String PT_TYPE = "pt_type";
    public static final String PT_SUBTITLE = "pt_subtitle";
    public static final String PT_DISMISS_INTENT = "pt_dismiss_intent";
    public static final String PT_SILENT_CHANNEL_ID = "pt_silent_sound_channel";
    public static final CharSequence PT_SILENT_CHANNEL_NAME = "Silent Channel";
    public static final String PT_SILENT_CHANNEL_DESC = "A channel to silently update notifications";
    public static final String PT_RATING_TOAST = "pt_rating_toast";
    public static final String PT_DOT_SEP = "pt_dot_sep";
    public static final String PT_COLOUR_WHITE = "#FFFFFF";
    public static final String PT_COLOUR_GREY = "#A6A6A6";
    public static final String PT_COLOUR_BLACK = "#000000";
    public static final String PT_META_CLR_DEFAULTS = PT_COLOUR_GREY;
    public static final String PT_PRODUCT_DISPLAY_ACTION_CLR_DEFAULTS = "#FFBB33";
    public static final String PT_PRODUCT_DISPLAY_ACTION_TEXT_CLR_DEFAULT = PT_COLOUR_WHITE;
    public static final int PT_CONNECTION_TIMEOUT = 10 * ONE_SECOND;
}
