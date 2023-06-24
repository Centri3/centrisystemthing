Moon	"Wawa/Lercurnis I III"
{
	ParentBody     "Verna-Luci bar"
	Class          "Aquaria"
	Mass            8.5698e-05
	Radius          389.09
	InertiaMoment   0.3971
	Oblateness      0.027481
	OblatenessInfo  0
	RotationPeriod  110.75
	RotationEpoch   1451545
	Obliquity       8
	EqAscendNode    52.214

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "lercurnis_verna_wawa.cfg"
		SurfStyle       0.031158
		Randomize      (-0.307, 0.552, 0.607)
		colorDistMagn   0.049664
		colorDistFreq   49.997
		detailScale     128
		drivenDarkening 0.49618
		seaLevel        -0.45038
		snowLevel       2
		tropicLatitude  0.75602
		icecapLatitude  2
		icecapHeight    0
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.26504
		heightTempGrad  0.625
		beachWidth      0.0010947
		tropicWidth     0.07
		mainFreq        4.1603
		venusFreq       2
		venusMagn       0.64885
		mareFreq        0.8
		mareDensity     1
		terraceProb     0.29452
		erosion         0
		montesMagn      0.1
		montesFreq      25
		montesSpiky     0
		montesFraction  1
		dunesMagn       0.041819
		dunesFreq       3.4493
		dunesFraction   0.2834
		hillsMagn       1
		hillsFreq       5
		hillsFraction   1
		hills2Fraction  1
		riversMagn      0
		riversFreq      2.4119
		riversSin       4.6613
		riftsMagn       0
		riftsFreq       2.3794
		riftsSin        5.1306
		eqridgeMagn     1
		eqridgeWidth    0.044551
		eqridgeModMagn  1.2214
		eqridgeModFreq  1.374
		canyonsMagn     0.44718
		canyonsFreq     0.12258
		canyonsFraction 0
		cracksMagn      0
		cracksFreq      15
		cracksOctaves   15
		craterMagn      0.3
		craterFreq      2
		craterDensity   1
		craterOctaves   30
		craterRayedFactor 0.06
		volcanoMagn     0.1752
		volcanoFreq     0.78284
		volcanoDensity  0.23832
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.18124
		volcanoRadius   0.13989
		volcanoTemp     275.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      20.2
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.2
		Hapke           0.5
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	Atmosphere
	{
		Model          "Lercurnis Verna Wawa"
		Height          100
		Density         7.6035e-06
		Pressure        1e-06
		Greenhouse      0.010544
		Bright          1
		Opacity         0.1
		SkyLight        0.33333
		Hue             0
		Saturation      1

		Composition
		{
			N2        	100
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      772.727718
		SemiMajorAxisKm 6010442.08
		Eccentricity    0.00558450592
		Inclination     8
		AscendingNode   52.2137405
		ArgOfPericenter -90.6870229
		MeanAnomaly     97.8867057
	}
}

