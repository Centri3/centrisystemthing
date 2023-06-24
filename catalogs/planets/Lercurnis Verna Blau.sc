DwarfMoon	"Blau/Lercurnis I II"
{
	ParentBody     "Verna-Luci bar"
	Class          "Asteroid"
	Mass            2.1544e-05
	Radius          215
	InertiaMoment   0.39938
	RotationPeriod  1200
	RotationEpoch   1451545
	Obliquity       8.2443
	EqAscendNode    -100.57

	AlbedoBond      0.25954
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1

	Surface
	{
		Preset         "lercurnis_verna_blau.cfg"
		SurfStyle       0.25236
		Randomize      (-0.687, 0.106, 0.321)
		colorDistMagn   0.26249
		colorDistFreq   2.7791
		detailScale     256
		drivenDarkening 0
		seaLevel        -0.38168
		snowLevel       2
		tropicLatitude  0.51812
		icecapLatitude  2
		icecapHeight    0.47515
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.18121
		heightTempGrad  0.625
		beachWidth      0.0011854
		tropicWidth     0.07
		mainFreq        5
		venusFreq       1.4046
		venusMagn       0.65
		terraceProb     0.30937
		erosion         0
		montesMagn      10
		montesFreq      2
		montesSpiky     1
		montesFraction  1
		dunesFraction   0
		hillsMagn       0.1
		hillsFreq       10
		hillsFraction   1
		hills2Fraction  1
		eqridgeMagn     0.58779
		eqridgeWidth    1
		eqridgeModMagn  2.5
		eqridgeModFreq  1.6031
		canyonsFraction 0
		craterMagn      0.03
		craterFreq      2
		craterDensity   1
		craterOctaves   30
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51644
		volcanoTemp     1146.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      30.8
		SpecBrightWater 0
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.8
		Gamma           0.9
		Hapke           0.24427
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      53.3977571
		SemiMajorAxisKm 1012476.27
		Eccentricity    0.0305343511
		Inclination     0
		AscendingNode   151.145038
		ArgOfPericenter 167.633588
		MeanAnomaly     -125.73688
	}
}

