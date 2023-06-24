// yum

//////////////////////////////////////////////////////////////////
//                                                              //
//      Local group galaxies catalog for SpaceEngine 0.990      //
//                                                              //
//                 Updated 16 December 2018                     //
//                                                              //
//////////////////////////////////////////////////////////////////

// Star solver log level:
// 0 - do not log
// 1 - log errors and warnings only
// 2 - log everything
LogLevel    0

//////////////////////////////////////////////////////////////////
//////      Octree parameters for NGC-IC.csv catalog        //////
//////////////////////////////////////////////////////////////////

OctreeSize  ( 1.2e8 1.2e8 1.5e8 )
OctreePos   ( 1e5 1e5 -2e7 )
OctreeDepth 4

//////////////////////////////////////////////////////////////////
//////                     Local group                      //////
//////////////////////////////////////////////////////////////////

Remove    "Milky Way"
Galaxy    "Milky Way"
{
	Type    "SBc"
	RA       17.760278
	Dec     -28.936111
	Dist     8584.74
	Radius   19329.8994
	AbsMagn -20.6
	Quat   ( -0.9252796 0.2015153 0.1678004 -0.27403 )
	SolFade  1
	ModelBright 0
}

Remove	"Andromeda/M 31/NGC 224/UGC 454/MCG 7-2-16"
Galaxy	"Andromeda/M 31/NGC 224/UGC 454/MCG 7-2-16"
{
	Type    "Sb"
	RA       0.7122
	Dec      41.2689
	Dist     788876.625
	Radius   21694.8737
	AbsMagn -20.12
	Quat   ( 0.5012805 -0.0873325 0.7087535 0.4886301 )
	ModelBright 0
}

Remove	"Triangulum/M 33/NGC 598/UGC 1117/MCG 5-4-69"
Galaxy	"Triangulum/M 33/NGC 598/UGC 1117/MCG 5-4-69"
{
	Type    "Sc"
	RA       1.566422  //1.5642
	Dec      30.694192 // 30.6581
	Dist     862766.74
	Radius   9093 //8621.53544
	AbsMagn -18.46
	Quat   ( -0.5593722 -0.5325336 0.3505069 -0.5297695 )
	ModelBright 0
}

/////////////////////////////////////
//       Milky Way satellites      //
/////////////////////////////////////

Remove	"Large Magellanic Cloud/LMC/Nubecula Major"
Galaxy	"Large Magellanic Cloud/LMC/Nubecula Major"
{
	Type    "Irr"
	RA       5.260678 // 5.307666  //5.3928
	Dec     -69.070640 // -69.070143 //-69.7561
	Dist     49970     //54881
	Radius   3915      //3000
	AbsMagn -17.68
	Axis   ( 287.0691 0.9555765 0.01017069 -0.294573 )
	Quat   ( -0.5155017 0.2897116 0.6218306 -0.5134705 )
	SolFade  1
	ModelBright 0
}

Remove	"Small Magellanic Cloud/SMC/Nubecula Minor/NGC 292"
Galaxy	"Small Magellanic Cloud/SMC/Nubecula Minor/NGC 292"
{
	Type    "Irr"
	RA       0.906829  //0.8772
	Dec     -72.766944 //-72.8003
	Dist     64385.6
	Radius   2008    //2500
	AbsMagn	-16.34
	Quat   ( -0.1068777 0.07064728 0.5766875 -0.8068567 )
	SolFade  1
	ModelBright 0
}

Remove	"Sag dSph"
Galaxy	"Sag dSph"
{
	Type    "E3"	// dSph
	RA       18 55 19.5
	Dec     -30 32 43
	Dist     20000
	Radius   970
	AppMagn  12.0 //AbsMagn -12.67
	ModelBright 0.2
	Quat   ( 0.116793357 -0.855947615 -0.503696317 0.00173539363 )
	ModelBright 0
}

Remove	"Sculptor dSph/ESO 351-30/E351-G30/PGC 3589/MCG -06-03-015"
Galaxy	"Sculptor dSph/ESO 351-30/E351-G30/PGC 3589/MCG -06-03-015"
{
	Type    "E0"
	RA       1.0025
	Dec     -33.7092
	Dist     90017.1695
	Radius   444.873682
	AbsMagn -9.77
	Quat   ( -0.229533078 -0.463142691 -0.499349194 0.695315609 )
	ModelBright 0
}

Remove	"Carina dSph/ESO 206-220/E206-G220/PGC 19441"
Galaxy	"Carina dSph/ESO 206-220/E206-G220/PGC 19441"
{
	Type    "E3"
	RA       6.6933
	Dec     -50.9661
	Dist     100012.264
	Radius   344.922737
	AbsMagn -8.97
	Quat   ( 0.299685034 0.142675127 0.105042132 -0.937442713 )
	ModelBright 0
}

Remove	"Sextans dSph/Sextans I/LEDA 88608"
Galaxy	"Sextans dSph/Sextans I/LEDA 88608"
{
	Type    "E4"
	RA       10.2175
	Dec     -1.6144
	Dist     90017.1695
	Radius   340.017169
	AbsMagn -7.98
	Quat   ( 0.124119939 0.195020704 -0.522381171 -0.820779555 )
	ModelBright 0
}

Remove	"Ursa Minor Dwarf/UMi dSph"
Galaxy	"Ursa Minor Dwarf/UMi dSph"
{
	Type    "E5"
	RA       15.1531
	Dec      67.2144
	Dist     60001.2264
	Radius   245.002453
	AbsMagn -7.13
	Quat   ( -0.368904922 -0.157460224 -0.842493284 -0.359611599 )
	ModelBright 0
}

Remove	"Draco Dwarf/DDO 208"
Galaxy	"Draco Dwarf/DDO 208"
{
	Type    "E3"
	RA       17.3336
	Dec      57.9094
	Dist     79991.4153
	Radius   394.898209
	AbsMagn -8.74
	Quat   ( -0.568791859 -0.299480137 -0.677814323 -0.356868622 )
	ModelBright 0
}

Remove	"Leo I/DDO 74"
Galaxy	"Leo I/DDO 74"
{
	Type    "E3"
	RA       10.1406
	Dec      12.3081
	Dist     250000
	Radius   350.134903
	AbsMagn -10.97
	Quat   ( 0.672507359 -0.141829227 -0.334367771 -0.644838365 )
	ModelBright 0
}

Remove	"Leo II/DDO 93"
Galaxy	"Leo II/DDO 93"
{
	Type    "E0"
	RA       11.2247
	Dec      22.1547
	Dist     210019.622
	Radius   365.158205
	AbsMagn -9.23
	Quat   ( 0.0708558153 0.072438793 -0.695529246 -0.711316486 )
	ModelBright 0
}

Remove	"CVn I dSph"
Galaxy	"CVn I dSph"
{
	Type    "E5"	// dSph
	RA       13 28 03.5
	Dec      33 33 21
	Dist     218000
	Radius   550
	AbsMagn -8.6
	ModelBright 0
}

Remove	"CVn II dSph"
Galaxy	"CVn II dSph"
{
	Type    "E4"	// dSph
	RA       12 57 10
	Dec      34 19 15
	Dist     160000
	Radius   74
	AbsMagn -4.9
	ModelBright 0
}

Remove	"Ursa Major I Dwarf/UMa I dSph"
Galaxy	"Ursa Major I Dwarf/UMa I dSph"
{
	Type    "E2"	// dSph
	RA       10 34 52.8
	Dec      51 55 12
	Dist     100000
	Radius   500
	AbsMagn -6.75
	ModelBright 0
}

Remove	"Ursa Major II Dwarf/UMa II dSph"
Galaxy	"Ursa Major II Dwarf/UMa II dSph"
{
	Type    "E5"	// dSph
	RA       08 51 30
	Dec      63 07 48
	Dist     30000
	Radius   125
	AbsMagn -3.8
	ModelBright 0
}

Remove	"Boötes I/Boo I/Boo dSph"
Galaxy	"Boötes I/Boo I/Boo dSph"
{
	Type    "E0"	// dSph
	RA       14 00 00
	Dec      14 30 00
	Dist     60000
	Radius   500
	AbsMagn -5.8
	ModelBright 0
}

Remove	"Boötes II/Boo II/PGC 4713552"
Galaxy	"Boötes II/Boo II/PGC 4713552"
{
	Type    "E2"	// dSph
	RA       13 58 00
	Dec      12 51 00
	Dist     42000
	Radius   100 // half-light radius of ~50 pc, so true radius likely >100 pc
	AbsMagn -2.7
	ModelBright 0
}

Remove	"Boötes III/Boo III/PGC 4713562"
Galaxy	"Boötes III/Boo III/PGC 4713562"
{
	Type    "E5"	// disrupted dSph? axis ratio 2:1
	RA       13 57 00
	Dec      26 48 00
	Dist     46000
	Radius   500
	AbsMagn -5.8
	ModelBright 0
}

/////////////////////////////////////
//       Andromeda satellites      //
/////////////////////////////////////

Remove	"M 110/NGC 205/UGC 426/MCG 7-2-14"
Galaxy	"M 110/NGC 205/UGC 426/MCG 7-2-14"
{
	Type    "E5"
	RA       0.6728
	Dec      41.6853
	Dist     760669.61
	Radius   2156.91685
	AbsMagn -15.5
	//Yaw      6.1
	//Pitch    48
	//Roll    -93
	Quat   ( -0.155913348 -0.0320174076 -0.962822877 0.218261357 )
	ModelBright 0
}

Remove	"M 32/NGC 221/UGC 452/MCG 7-2-15"
Galaxy	"M 32/NGC 221/UGC 452/MCG 7-2-15"
{
	Type    "E2"
	RA       0.7114
	Dec      40.8658
	Dist     847130.243
	Radius   1047.33873
	AbsMagn -15.54
	//Yaw      13.3
	//Pitch   -49.1
	//Roll     92
	Quat   ( -0.0976718868 0.0154818296 -0.970054662 0.221843342 )
	ModelBright 0
}

Remove	"NGC 147/UGC 326/MCG 8-2-5/DDO 3"
Galaxy	"NGC 147/UGC 326/MCG 8-2-5/DDO 3"
{
	Type    "E5"
	RA       0.5531
	Dec      48.5072
	Dist     700576.404
	Radius   1345.35197
	AbsMagn -13.82
	Quat   ( 0.83699223 0.520281131 0.1536255 -0.0717687838 )
	ModelBright 0
}

Remove	"And I/KK 8"
Galaxy	"And I/KK 8"
{
	Type    "E0"
	RA       0.7611
	Dec      38.0372
	Dist     810031.886
	Radius   489.943586
	AbsMagn -10.87
	Quat   ( 0.787282722 0.608511984 -0.0787008854 -0.0608707764 )
	ModelBright 0
}

Remove	"And II/KK 12"
Galaxy	"And II/KK 12"
{
	Type    "E3"
	RA       1.2747
	Dec      33.4192
	Dist     680034.339
	Radius   285.01349
	AbsMagn -9.33
	Quat   ( 0.755310192 0.633968582 -0.127226952 -0.106787887 )
	ModelBright 0
}

Remove	"And III/KK 5"
Galaxy	"And III/KK 5"
{
	Type    "E6"
	RA       0.5925
	Dec      36.4978
	Dist     760056.414
	Radius   305.003679
	AbsMagn -9.3
	Quat   ( 0.780568153 0.620252109 -0.0606559857 -0.0481822671 )
	ModelBright 0
}

Remove	"And IV"
Galaxy	"And IV"	// probably not a galaxy
{
	Type    "Irr"
	RA       0.7083
	Dec      40.5758
	Dist     6110497.92
	Radius   1160.16679
	AbsMagn -12.6
	ModelBright 0
}

Remove	"And V"
Galaxy	"And V"
{
	Type    "E0"
	RA       1.1714
	Dec      47.6281
	Dist     810031.886
	Radius   250
	AbsMagn -8.41
	ModelBright 0
}

Remove	"And VI/Pegasus dSph"
Galaxy	"And VI/Pegasus dSph"
{
	Type    "E3"
	RA       23.8628
	Dec      24.5861
	Dist     820149.62
	Radius   439.968114
	AbsMagn -10.8
	Quat   ( 0.714058525 0.699854669 0.0128555614 0.0125936282 )
	ModelBright 0
}

Remove	"And VII/Cassiopeia dSph"
Galaxy	"And VII/Cassiopeia dSph"
{
	Type    "E3"
	RA       23.4419
	Dec      50.6756
	Dist     790103.017
	Radius   324.993868
	AbsMagn -11.67
	Quat   ( 0.851435073 0.519356864 0.062328548 0.0379725851 )
	ModelBright 0
}

Remove	"Fornax dSph/ESO 356-04/E356-G04"
Galaxy	"Fornax dSph/ESO 356-04/E356-G04"
{
	Type    "E4"
	RA       2.665
	Dec     -34.5258
	Dist     139992.642
	Radius   584.988962
	AbsMagn -11.5
	Quat   ( 0.333150518 0.650318832 0.216897976 -0.647341808 )
	ModelBright 0
}

/////////////////////////////////////
//      Triangulum satellites      //
/////////////////////////////////////

Remove	"Pisces Dwarf/Pisces I/LGS 3/PGC 3792"
Galaxy	"Pisces Dwarf/Pisces I/LGS 3/PGC 3792"
{
	Type    "E3"	// dSph or dIrr
	RA       01 03 55
	Dec      21 53 06
	Dist     769000
	Radius   223
	AbsMagn -7.96
	ModelBright 0
}

/////////////////////////////////////
//      Other dwarf galaxies       //
/////////////////////////////////////

Remove	"Wolf-Lundmark-Melotte/WLM/DDO 221"
Galaxy	"Wolf-Lundmark-Melotte/WLM/DDO 221"
{
	Type    "Irr"
	RA       0.0328
	Dec     -15.4611
	Dist     920100.564
	Radius   1290.16434
	AbsMagn -13.95
	Quat   ( -0.368979089 -0.722439655 -0.405214971 -0.421587719 )
	ModelBright 0
}

Remove	"IC 10/UGC 192/MCG 10-1-1/IRAS 177+5900"
Galaxy	"IC 10/UGC 192/MCG 10-1-1/IRAS 177+5900"
{
	Type    "Irr"
	RA       0.34
	Dec      59.2925
	Dist     796541.575
	Radius   741.353937
	AbsMagn -12.7
	Quat   ( -0.497521549 0.0992930434 -0.858642109 -0.0731226962 )
	ModelBright 0
}

Remove	"IC 1613/UGC 668/MCG0-3-70/DDO 8"
Galaxy	"IC 1613/UGC 668/MCG0-3-70/DDO 8"
{
	Type    "Irr"
	RA       1.0797
	Dec      2.1186
	Dist     752084.866
	Radius   1815.97989
	AbsMagn -14.48
	Quat   ( 0.643999226 0.652545883 0.382656284 -0.114118515 )
	ModelBright 0
}

Remove	"Phoenix Dwarf/PGC 6830"
Galaxy	"Phoenix Dwarf/PGC 6830"
{
	Type    "Irr"
	RA       1.8517
	Dec     -44.4447
	Dist     439968.114
	Radius   295.008585
	AbsMagn -10.22
	Quat   ( -0.449451028 -0.501720123 -0.454905748 0.582521632 )
	ModelBright 0
}

Remove	"Leo A/Leo III/DDO 69"
Galaxy	"Leo A/Leo III/DDO 69"
{
	Type    "Irr"
	RA       9.9906
	Dec      30.7464
	Dist     690152.073
	Radius   470.014717
	AbsMagn -11.36
	Quat   ( 0.308681312 0.570194654 -0.609617391 -0.456026907 )
	ModelBright 0
}

Remove	"Sextans A/DDO 75"
Galaxy	"Sextans A/DDO 75"
{
	Type    "Irr"
	RA       10.1833
	Dec     -4.6928
	Dist     1319904.34
	Radius   1135.02575
	AbsMagn -13.95
	Quat   ( 0.285690887 0.43024664 -0.435206371 -0.737471328 )
	ModelBright 0
}

Remove	"Sextans B/UGC 5373/DDO 70"
Galaxy	"Sextans B/UGC 5373/DDO 70"
{
	Type    "Irr"
	RA       10
	Dec      5.3322
	Dist     1360068.68
	Radius   965.170468
	AbsMagn -13.96
	Quat   ( 0.886261411 -0.114980546 -0.360230642 -0.267495926 )
	ModelBright 0
}

Remove	"NGC 3109/ESO 499-36/MCG -4-24-13/UGCA 194"
Galaxy	"NGC 3109/ESO 499-36/MCG -4-24-13/UGCA 194"
{
	Type    "Irr"
	RA       10.0517
	Dec     -26.1583
	Dist     1241108.66
	Radius   3449.22737
	AbsMagn -15.06
	Quat   ( 0.847230499 0.0364319832 -0.45027052 -0.279516815 )
	ModelBright 0
}

Remove	"Sag DIG/ESO 594-4"
Galaxy	"Sag DIG/ESO 594-4"
{
	Type    "Irr"
	RA       19.4997
	Dec     -17.6781
	Dist     1039980.38
	Radius   459.896983
	AbsMagn -11.49
	Quat   ( -0.0512254575 -0.522659907 -0.850457492 -0.0304077087 )
	ModelBright 0
}

Remove	"Barnard's galaxy/NGC 6822/IC 4895/MCG -2-50-6/DDO 209"
Galaxy	"Barnard's galaxy/NGC 6822/IC 4895/MCG -2-50-6/DDO 209"
{
	Type    "Irr"
	RA       19.7489
	Dec     -14.8064
	Dist     549730.194
	Radius   1231.29752
	AbsMagn -14.4
	Quat   ( -0.27297615 -0.663344645 -0.382006696 -0.582690988 )
	ModelBright 0
}

Remove	"Pegasus DIG/DDO 216"
Galaxy	"Pegasus DIG/DDO 216"
{
	Type    "Irr"
	RA       23.4761
	Dec      14.7467
	Dist     760056.414
	Radius   519.990189
	AbsMagn -11.47
	Quat   ( -0.551793869 -0.0595693808 -0.825322043 0.104012215 )
	ModelBright 0
}

Remove	"Cetus Dwarf/KKSG 1"
Galaxy	"Cetus Dwarf/KKSG 1"
{
	Type    "E4"
	RA       0.4364
	Dec     -11.0444
	Dist     779985.283
	Radius   565.060093
	AbsMagn -10.18
	Quat   ( 0.464979712 0.883476956 -0.0265784897 -0.0505561014 )
	ModelBright 0
}

Remove	"Antlia Dwarf/PGC 29194"
Galaxy	"Antlia Dwarf/PGC 29194"
{
	Type    "E3"
	RA       10.0678
	Dec     -27.3319
	Dist     1319904.34
	Radius   389.992642
	AbsMagn -9.75
	Quat   ( 0.0840272253 0.235750649 -0.324989555 -0.911999367 )
	ModelBright 0
}

Remove	"Tucana Dwarf/PGC 69519"
Galaxy	"Tucana Dwarf/PGC 69519"
{
	Type    "E5"
	RA       22.6969
	Dec     -64.42
	Dist     879936.228
	Radius   320.0883
	AbsMagn -9.16
	Quat   ( 0.0184136797 0.985323535 0.0031752392 0.169671406 )
	ModelBright 0
}

Remove  "Aquarius Dwarf/Aqr DIG/DDO 210"
Galaxy  "Aquarius Dwarf/Aqr DIG/DDO 210"
{
	Type    "Irr"
	RA       20 46 51.8
	Dec     -12 50 53
	Dist     980000
	Radius   313.6
	AppMagn  14.83
	ModelBright 0
}

//////////////////////////////////////////////////////////////////
//////              Galaxies with custom data               //////
//////////////////////////////////////////////////////////////////

Remove "Tadpole Galaxy/UGC 10214/Arp 188/PCG 57129"
Galaxy "Tadpole Galaxy/UGC 10214/Arp 188/PCG 57129"
{
	Type        "Irr"
	RA           16.1511
	Dec         +55.4256
	Dist         1.25e8
	Radius       210000
	AbsMagn     -20.47
	Axis       ( 164.6383, 0.03612383, -0.936817, 0.3479495 )
	ModelBright 0
}

Remove	"Arp 148"
Galaxy	"Arp 148"
{
	Type    "Irr"
	RA       11.06519
	Dec     +40.84997222
	Dist     152.0e6
	Radius   20000
	AbsMagn -20.74
	Axis   ( 132.7528, 0.9932426, 0.0005029213, 0.1159481 )
	ModelBright 0
}

Remove	"Arp 148 Disk"
Galaxy	"Arp 148 Disk"
{
	Type    "Irr"
	RA       11.06477778
	Dec     +40.84997222
	Dist     152.0e6
	Radius   17759
	AbsMagn -20.74
	Axis   ( 132.7528, 0.9932426, 0.0005029213, 0.1159481 )
	ModelBright 0
}
