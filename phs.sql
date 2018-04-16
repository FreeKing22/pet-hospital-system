-- phpMyAdmin SQL Dump
-- version 4.3.13
-- http://www.phpmyadmin.net
--
-- Host: dutpnvwgahfh.mysql.sae.sina.com.cn:10324
-- Generation Time: 2018-04-16 11:15:59
-- 服务器版本： 5.7.18-15-log
-- PHP Version: 5.3.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `phs`
--

-- --------------------------------------------------------

--
-- 表的结构 `phs_case`
--

CREATE TABLE IF NOT EXISTS `phs_case` (
  `id` int(11) NOT NULL,
  `disease_id` int(11) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `description` varchar(1000) DEFAULT NULL,
  `image_list` varchar(200) DEFAULT NULL,
  `video` varchar(500) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

--
-- 转存表中的数据 `phs_case`
--

INSERT INTO `phs_case` (`id`, `disease_id`, `name`, `description`, `image_list`, `video`) VALUES
(4, 1, '病例A', '贵宾十五，2岁，雌性。该犬平时主要饲喂犬粮，偶尔吃少量零食。今年未免疫，驱虫。今日食欲下降，精神尚可，最初出现黄色脓性眼分泌物，鼻头干燥。两天前开始频繁的咳嗽，偶有少量白色粘液咳出，粪便软。体温39.5℃，体重3.5kg，心率128次/min、呼吸28次/min。睑结膜潮红，水润度下降，鼻头干燥，有少量黄色鼻液，诱咳反应阳性。目前临床上对于犬瘟热是采用特异性的抗病毒与对症支持疗法相结合的治疗方法。由于未按时免疫的动物以及母源抗体消耗殆尽的幼年动物体内缺少可以抵抗病毒的抗体，或者由于自身免疫力的下降，不足以产生足够的抗体来对抗体内的病毒，所以外源性的抗体补给在治疗过程中显得尤为重要。同时，干扰素，胸腺肽等生物制剂在抗病毒治疗过程中也起到积极的作用。', 'quanwenreA01.jpg&&quanwenreA02.jpg&&quanwenreA03.jpg', 'http://player.video.qiyi.com/180d20d969b804c23535ee3e625ad59d/0/196/w_19rtip8v9x.swf-albumId=0-tvId=4372055609-isPurchase=0-cnId=27'),
(5, 1, '病例B', '德牧MAX，2月龄，雄性。该犬从外地购买，一周前运回、免疫一针，未驱虫。室内饲养，近日出现频繁的腹泻，颜色暗红，精神不振，食欲尚可。体温38.9℃，体重4.7kg，心率142次/min、呼吸32次/min。睑结膜潮红，听诊呼吸音粗粝，心音整齐。为了控制继发的呼吸道或胃肠道炎症，在未进行药敏实验的前提下，治疗的过程中需加入两种或两种以上的抗生素以增加抗菌谱，进而积极有效的控制炎症发展。', 'quanwenreB01.jpg&&quanwenreB02.jpg&&quanwenreB03.jpg', 'http://player.video.qiyi.com/180d20d969b804c23535ee3e625ad59d/0/196/w_19rtip8v9x.swf-albumId=0-tvId=4372055609-isPurchase=0-cnId=27');

-- --------------------------------------------------------

--
-- 表的结构 `phs_disease`
--

CREATE TABLE IF NOT EXISTS `phs_disease` (
  `id` int(11) NOT NULL,
  `kind_id` int(11) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `image` varchar(100) DEFAULT NULL,
  `description` varchar(1000) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

--
-- 转存表中的数据 `phs_disease`
--

INSERT INTO `phs_disease` (`id`, `kind_id`, `name`, `image`, `description`) VALUES
(1, 1, '犬瘟热', 'quanwenre.jpg', '犬热病一种犬科动物的疾病，根据国家农业部于2008年12月11日公布的动物疫病名录统计，犬瘟热属三类动物疫病，主要感染犬科动物，传染渠道主要是通过与病兽直接接触'),
(2, 3, '口炎', 'kouyan.jpg', '口炎是口腔黏膜的炎症，可波及颊黏膜、舌、齿龈、上腭等处。在小儿时期较多见，尤其是婴幼儿，可单纯发病也可继发于腹泻、营养不良、急性感染、久病体弱等全身性疾病时。引起口炎的主要有细菌、病毒及真菌'),
(3, 2, '蛔虫病', 'huichongbing.jpg', '似蚓蛔线虫简称蛔虫，是人体内最常见的寄生虫之一。成虫寄生于小肠，可引起蛔虫病。此外，犬弓首线虫（简称犬蛔虫）是犬类常见的肠道寄生虫，其幼虫能在人体内移行，引起内脏幼虫移行症。'),
(4, 4, '脱毛症', 'tuomaozheng.jpg', '脱毛症，又称秃毛症、无毛症或稀毛症，是指局部或全身被毛脱落的总称。该病的皮肤病变较轻，以脱毛为主要特征。脱毛症分为先天性和后天性两种。先天性见于遗传；后天性脱毛症多继发于全身性疾病。'),
(5, 1, '犬细小病毒', 'quanxixiaobingdu.jpg', '犬细小病毒是1978年澳大利亚的Kelly和加拿大的Thomson等同时从患肠炎的病犬粪便中分离获得的，从发现该病毒至今，世界各地均有流行，是危害犬类的最主要的烈性传染病之一。'),
(6, 1, '犬传染性肝炎', 'quanchuanranxingganyan.jpg', '犬传染性肝炎主要发生在1岁以内的幼犬，成年犬很少发生且多为隐性感染，即使发病也多能耐过。病犬和带毒犬是主要传染源。病犬的分泌物、排泄物均含有病毒，康复带毒犬可自尿中长时间排毒。'),
(7, 1, '犬冠状病毒', 'quanguanzhuangbingdu.jpg', '犬冠状病毒为单胜RNA病毒，有6～7种多肽，其中4种是糖肽，不含RNA聚合酶及神经氨酸酶。可使犬发生程度不同的胃肠炎症状，特征有频繁呕吐、腹泻、沉郁、厌食等症状。');

-- --------------------------------------------------------

--
-- 表的结构 `phs_quiz`
--

CREATE TABLE IF NOT EXISTS `phs_quiz` (
  `id` int(11) NOT NULL,
  `disease_id` int(11) NOT NULL,
  `question` varchar(100) DEFAULT NULL,
  `choice_list` varchar(200) DEFAULT NULL,
  `answer` varchar(5) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

--
-- 转存表中的数据 `phs_quiz`
--

INSERT INTO `phs_quiz` (`id`, `disease_id`, `question`, `choice_list`, `answer`) VALUES
(1, 1, '下列不属于《中华人民共和国动物防疫法》所称动物疫病的是（）', 'A.禽霍乱&&B.白肌病&&C.禽结合病&&D.犬瘟热', 'A'),
(2, 1, '病犬在康复期出现角膜混浊的常见传染病是（）', 'A.犬瘟热&&B.犬传染性肝炎&&C.犬冠状病毒性腹泻&&D.禽霍乱', 'B'),
(3, 1, '犬猫可视黏膜检查的主要部位是（）', 'A.眼结膜&&B.鼻腔黏膜&&C.口腔黏膜&&D.直肠黏膜', 'C'),
(4, 1, '口炎的症状不包括（）', 'A.大量流涎&&B.咀嚼障碍&&C.吞咽障碍&&D.采食缓慢', 'C'),
(5, 1, '测量犬猫体温的主要部位是（）', 'A.皮肤&&B.口腔&&C.腋下&&D.直肠', 'D'),
(6, 1, '腊肠犬，10岁，头颈僵直，耳竖起，鼻尖抵地，运步小心，触诊颈部敏感。该犬最可能患有（）', 'A.肱骨骨折&&B.肘关节炎&&C.犬瘟热&&D.桡神经麻痹', 'D'),
(7, 1, '母犬，10岁，多食、多饮、多尿，体重减轻，血糖浓度为10mmol/L.有效的治疗药物是（）', 'A.肌苷&&B.犬瘟热&&C.胰岛素&&D.干扰素', 'C'),
(8, 1, '犬，排粪困难，里急后重，甩尾，擦舔肛门，挤压其肛门疼痛并流出黑灰色恶臭物。该病是（）', 'A.肛门囊炎&&B.犬瘟热&&C.犬传染性肝&&D.犬冠状病毒性腹泻', 'A'),
(9, 1, '北京犬，发病1周，包皮肿胀，包皮口污秽不洁、流出脓样腥臭液体；翻开包皮囊，见红肿、溃疡病变。该病是（）', 'A.包皮囊炎&&B.犬瘟热&&C.前列腺炎&&D.犬传染性肝', 'A'),
(10, 1, '犬，饮水量增加，皮肤增厚，弹性降低，色素沉着，躯干部对称性脱毛。X线检查显示骨质疏松。该犬内分泌异常的激素最可能是（）', 'A.甲状腺素&&B.糖皮质素&&C.胰岛素&&D.干扰素', 'A'),
(11, 1, '从猫粪中排出的弓形虫发育阶段是（）', 'A.包囊&&B.卵囊&&C.劣殖子&&D.配子体', 'D'),
(12, 1, '预防伊氏锥虫病最实用的措施为（）', 'A.疫苗免疫&&B.药物预防&&C.淘汰病畜&&D.消灭媒介昆虫', 'C'),
(13, 1, '狗蠕形螨主要寄生在（）', 'A.毛囊和皮脂腺&&B.表皮&&C.咬肌&&D.肝脏', 'A'),
(14, 1, '复孔绦虫病是由于犬、猫类舔被毛时含有跳（）蚤或虱类而被感染。', 'A.囊尾蚴&&B.尾蚴&&C.似囊尾蚴&&D.雷蚴', 'A'),
(15, 1, '犬传染性肝炎根据临床症状和进过可分为（）种。', 'A.两种&&B.三种&&C.四种&&D.五种', 'A'),
(16, 1, '螨虫属于不完全变态。发育过程包括（）个阶段。', 'A.2&&B.3&&C.4&&D.5', 'D'),
(17, 1, '犬猫的螨虫病包括（）种。（）', 'A.2&&B.3&&C.4&&D.5', 'C'),
(18, 1, '狗蠕形螨主要寄生在（）', 'A.2&&B.3&&C.4&&D.5', 'A'),
(19, 1, '根据骨折部位可划分（）种骨折。', 'A.2&&B.3&&C.4&&D.5', 'A'),
(20, 1, '难产的病因不包括（）', 'A.母兽产道狭窄&&B.母兽分娩不足&&C.医师技术&&D.胎儿异常', 'A');

-- --------------------------------------------------------

--
-- 表的结构 `phs_work`
--

CREATE TABLE IF NOT EXISTS `phs_work` (
  `id` int(11) NOT NULL,
  `job_id` int(11) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `description` varchar(1000) DEFAULT NULL,
  `room` varchar(100) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

--
-- 转存表中的数据 `phs_work`
--

INSERT INTO `phs_work` (`id`, `job_id`, `name`, `description`, `room`) VALUES
(1, 1, '查房', '带领实习医师对病员进行检查，诊断及治疗，书写医嘱，并检查医嘱执行情况，每日巡视病人至少2次，对危重症病人应多次巡视并做好记录。', '诊室'),
(2, 1, '书写病例', '书写病历(第一年写大病历，以后写入院录)应于病人入院24小时内完成。及时检查和修改实习医师的病历记录、病程录及其他各项记录，及时完成出院病案小结并将病案整理编号交上级医师审查。', '诊室'),
(3, 2, '抢救病人', '参加科室内的抢救工作要求，在抢救病人过程中，做到处理得当，抢救及时，及时完成病程记录。', '前台'),
(4, 3, '病员记录', '参住院前台对所管病员全面负责，在下班前做好交接班工作，对需要特殊观察的重症病人除书面交班外，用口头方式向值班前台交班。', '前台');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `phs_case`
--
ALTER TABLE `phs_case`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `phs_disease`
--
ALTER TABLE `phs_disease`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `phs_quiz`
--
ALTER TABLE `phs_quiz`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `phs_work`
--
ALTER TABLE `phs_work`
  ADD PRIMARY KEY (`id`), ADD UNIQUE KEY `id` (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `phs_case`
--
ALTER TABLE `phs_case`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `phs_disease`
--
ALTER TABLE `phs_disease`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `phs_quiz`
--
ALTER TABLE `phs_quiz`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=21;
--
-- AUTO_INCREMENT for table `phs_work`
--
ALTER TABLE `phs_work`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
